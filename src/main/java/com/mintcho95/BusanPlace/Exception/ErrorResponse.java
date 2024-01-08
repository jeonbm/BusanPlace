package com.mintcho95.BusanPlace.Exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorResponse {
    private HttpStatus status;
    private String message;

//    public ErrorResponse(HttpStatus _status,String _message){
//        this.status = _status;
//        this.message = _message;
//    }
}
