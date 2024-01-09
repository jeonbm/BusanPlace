package com.mintcho95.BusanPlace.Jwt.Jwt;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    // 20. TokenProvider , JwtFillter를 SecurityConfig에 적용하기 위해 클래스를 생성한다.
    // 21. SecurityConfigurerAdapter를 상속받고

    private final TokenProvider tokenProvider;

    // 22. TokenProvider를 주입받고
    public JwtSecurityConfig(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public void configure(HttpSecurity http) {
        // 23. JwtFilter를 통해서 Security로직에 필터를 추가한다.
        http.addFilterBefore(
                new JwtFilter(tokenProvider),
                UsernamePasswordAuthenticationFilter.class
        );
    }
}