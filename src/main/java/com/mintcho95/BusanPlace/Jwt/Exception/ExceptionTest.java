package com.mintcho95.BusanPlace.Jwt.Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.ConnectException;

@Slf4j
//@RestControllerAdvice
public class ExceptionTest {
//    @ExceptionHandler({ConnectException.class}) //500
//    protected ResponseEntity<ErrorResponse> ExceptionHandler(final Exception e) {
//        // DB서버가 도중에 터지면 프로그램이 터지는데 서버가 없으면 실행을 못하네
//        System.out.println("에러떳어요");
//        log.error(e.getCause().getMessage());
//        return new ResponseEntity<>(new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.toString(),"데이터베이스 서버가 먹튀했답니다."), HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
