package com.mintcho95.BusanPlace.Member.Service;

import com.mintcho95.BusanPlace.Member.Dto.UserDto;
import com.mintcho95.BusanPlace.Member.Entity.Authority;
import com.mintcho95.BusanPlace.Member.Entity.User;
import com.mintcho95.BusanPlace.Member.Repository.UserRepository;
import com.mintcho95.BusanPlace.Jwt.Util.SecurityUtil;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;

@Service
public class UserService {
    // 회원가입 , 유저정보조회 메소드

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // 회원가입 로직 수행
    @Transactional
    public User signup(UserDto userDto) {

        // UserDto의 username을 이용해 DB에 존재하는지 확인
        if (userRepository.findOneWithAuthoritiesByUsername(userDto.getUsername()).orElse(null)
                != null) {
            throw new RuntimeException("이미 가입되어 있는 유저입니다.");
        }
        // DB에 존재하지 않으면 권한정보 생성
        Authority authority = Authority.builder().authorityName("ROLE_USER").build();

        // 권한정보를 포함한 User 정보를 생성
        User user = User.builder()
                .username(userDto.getUsername())
                .password(passwordEncoder.encode(userDto.getPassword()))
                .nickname(userDto.getNickname())
                .authorities(Collections.singleton(authority))
                .activated(true)
                .build();

        // 최정 설정한 User 정보를 DB에 저장
        return userRepository.save(user);
    }

    // 유저, 권한정보를 가져오는 메서드 1
    // username을 기준으로 정보를 가져옴
    @Transactional(readOnly = true)
    public Optional<User> getUserWithAuthorities(String username) {

        Optional<User> result = null;

        try{
            result = userRepository.findOneWithAuthoritiesByUsername(username);
        }catch(RuntimeException e){
            System.out.println("연결에러");
        }


        return result;
    }

    // 유저, 권한정보를 가져오는 메서드 2
    // SecurityContext에 저장된 username 정보만 가져옴
    @Transactional(readOnly = true)
    public Optional<User> getMyUserWithAuthorities(){
        return SecurityUtil.getCurrentUsername()
                .flatMap(userRepository::findOneWithAuthoritiesByUsername);
    }

}
