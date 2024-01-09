package com.mintcho95.BusanPlace.Member.Controller;

import com.mintcho95.BusanPlace.Member.Dto.UserDto;
import com.mintcho95.BusanPlace.Member.Entity.User;
import com.mintcho95.BusanPlace.Member.Service.UserService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    //가입
    @PostMapping("/signup")
    public ResponseEntity<User> signup(@Valid @RequestBody UserDto _userDto){
        return ResponseEntity.ok(userService.signup(_userDto));
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<User> getMyUserInfo(){
        return ResponseEntity.ok(userService.getMyUserWithAuthorities().get());
    }

    @GetMapping("/user/{username}")
    @PreAuthorize("hasAnyRole('ADMIN')") // 토큰검증후에 최종결과가 ADMIN인 사람만 접근
    public ResponseEntity<User> getUserInfo(@PathVariable String username){
        // 필터레벨에서 분석해서 String name으로 쏴주는듯??
        return ResponseEntity.ok(userService.getUserWithAuthorities(username).get());
    }
}
