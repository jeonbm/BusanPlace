package com.mintcho95.BusanPlace.Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
public class ExceptionController{

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ErrorResponse> application(ApplicationException _e){
        log.error("에러 : {} ",_e.toString());

        ErrorResponse d = new ErrorResponse();
        d.setStatus(_e.getErrorCode().getHttpStatus());
        d.setMessage(_e.getErrorCode().name());

        //return ResponseEntity.status(_e.getErrorCode().getHttpStatus()).body(_e.getErrorCode().name());
        return new ResponseEntity<>(d,_e.getErrorCode().getHttpStatus());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorResponse> emptyValue(HttpMessageNotReadableException _e){
        // 필드값 체크등등 하려면 하겠지만 그냥 400번 에러화면을 감춰야겠다.
        log.error("에러 : {} ",_e.toString());

        ErrorResponse d = new ErrorResponse();
        d.setStatus(ErrorCode.FIELD_NAME_CHECK.getHttpStatus());
        d.setMessage(ErrorCode.FIELD_NAME_CHECK.getMessage());

        //return ResponseEntity.status(_e.getErrorCode().getHttpStatus()).body(_e.getErrorCode().name());
        return new ResponseEntity<>(d,ErrorCode.FIELD_NAME_CHECK.getHttpStatus());
    }


//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    public ResponseEntity<ErrorResponse> invildField(HttpMessageNotReadableException _e){
//        // 필드값 체크등등 하려면 하겠지만 그냥 400번 에러화면을 감춰야겠다.
//        log.error("에러 : {} ",_e.toString());
//
//        ErrorResponse d = new ErrorResponse();
//        d.setStatus(ErrorCode.FIELD_NAME_CHECK.getHttpStatus());
//        d.setMessage(ErrorCode.FIELD_NAME_CHECK.getMessage());
//
//        //return ResponseEntity.status(_e.getErrorCode().getHttpStatus()).body(_e.getErrorCode().name());
//        return new ResponseEntity<>(d,ErrorCode.FIELD_NAME_CHECK.getHttpStatus());
//    }



    @ExceptionHandler(NoHandlerFoundException.class) // 404에러
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> notFound(Exception _e){
        log.error("에러 : {} ",_e.toString());

        ErrorResponse d = new ErrorResponse();
        d.setStatus(ErrorCode.INVAILD_REQUEST_ERROR.getHttpStatus());
        d.setMessage(ErrorCode.INVAILD_REQUEST_ERROR.getMessage());

        return new ResponseEntity<>(d,ErrorCode.INVAILD_REQUEST_ERROR.getHttpStatus());
    }


    @ExceptionHandler(Exception.class) // 500에러
    public ResponseEntity<ErrorResponse> exceptionError(Exception _e){
        log.error("에러1 : {} ",_e.toString());

        ErrorResponse d = new ErrorResponse();
        d.setStatus(ErrorCode.INTERNAL_SERVER_ERROR.getHttpStatus());
        d.setMessage(ErrorCode.INTERNAL_SERVER_ERROR.getMessage());

        return new ResponseEntity<>(d,ErrorCode.INTERNAL_SERVER_ERROR.getHttpStatus());
    }






}
