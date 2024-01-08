package com.mintcho95.BusanPlace.Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ErrorMessageDto> application(ApplicationException _e){
        log.error("에러 : {} ",_e.toString());

        ErrorMessageDto d = new ErrorMessageDto();
        d.setStatus(_e.getErrorCode().getHttpStatus());
        d.setMessage(_e.getErrorCode().name());

        //return ResponseEntity.status(_e.getErrorCode().getHttpStatus()).body(_e.getErrorCode().name());
        return new ResponseEntity<>(d,_e.getErrorCode().getHttpStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorMessageDto> emptyValue(MethodArgumentNotValidException _e){
        // 필드값 체크등등 하려면 하겠지만 그냥 400번 에러화면을 감춰야겠다.
        log.error("에러 : {} ",_e.toString());

        ErrorMessageDto d = new ErrorMessageDto();
        d.setStatus(ErrorCode.FIELD_NAME_CHECK.getHttpStatus());
        d.setMessage(ErrorCode.FIELD_NAME_CHECK.getMessage());

        //return ResponseEntity.status(_e.getErrorCode().getHttpStatus()).body(_e.getErrorCode().name());
        return new ResponseEntity<>(d,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorMessageDto> badRequest(Exception _e){
        log.error("에러 : {} ",_e.toString());

        ErrorMessageDto d = new ErrorMessageDto();
        d.setStatus(HttpStatus.BAD_REQUEST);
        d.setMessage("올바르지 않은 요청입니다.");

        return new ResponseEntity<>(d,HttpStatus.NOT_FOUND);
    }

}
