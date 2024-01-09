package com.mintcho95.BusanPlace.Config;


import com.mintcho95.BusanPlace.Jwt.Jwt.JwtAccessDeniedHandler;
import com.mintcho95.BusanPlace.Jwt.Jwt.JwtAuthenticationEntryPoint;
import com.mintcho95.BusanPlace.Jwt.Jwt.JwtSecurityConfig;
import com.mintcho95.BusanPlace.Jwt.Jwt.TokenProvider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private final TokenProvider tokenProvider;
    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    private final JwtAccessDeniedHandler jwtAccessDeniedHandler;

    public SecurityConfig(TokenProvider tokenProvider,
                          JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint,
                          JwtAccessDeniedHandler jwtAccessDeniedHandler) {
        this.tokenProvider = tokenProvider;
        this.jwtAuthenticationEntryPoint = jwtAuthenticationEntryPoint;
        this.jwtAccessDeniedHandler = jwtAccessDeniedHandler;
    }

    @Bean
    public PasswordEncoder  passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public WebSecurityCustomizer configure() {
        // h2 디비 관리 웹페이지가 8080 포트라서 예외처리를 따로 해줘야하는듯함 ( 다른프로그램이여도 JVM에서 관리를 하나봄 )
        // h2-console 및 favicon 하위 요청은 모두 무시
        return (web) -> web.ignoring()
                .requestMatchers(new AntPathRequestMatcher("/h2-console/**"))
                .requestMatchers(new AntPathRequestMatcher("/favicon.ico"));
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity
                // RestAPI 로 작동되기에 스크립트로 해킹당할 가능성이 낮아서 해제해줘도 되는가봄
                .csrf(AbstractHttpConfigurer::disable)

                .exceptionHandling((handling) ->
                        // 람다식으로 처리된거같고 인증되지 않은사용자와 권한이없는 사용자에 대해서 접근제어를 함
                        handling.authenticationEntryPoint(jwtAuthenticationEntryPoint)
                                .accessDeniedHandler(jwtAccessDeniedHandler)
                )

                .headers((header) -> header.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin))

                // 세션을 관리 하지 않기 때문에 비활성화
                .sessionManagement((session)->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))


                // 아래 접근주소로 접근시 접근제어를 거치지 않고 접속을 허락함
                .authorizeHttpRequests((registry) ->
                        registry.requestMatchers(

                                        new AntPathRequestMatcher("/member/hello"),
                                        new AntPathRequestMatcher("/member/authenticate"),
                                        new AntPathRequestMatcher("/member/signup"),
                                        new AntPathRequestMatcher("/img/*")

                                )
                                .permitAll()
                                .anyRequest().authenticated()
                )

                // 그 외에는 토큰프로바이더로 체크를함
                .apply(new JwtSecurityConfig(tokenProvider));


        return httpSecurity.build();
    }
}