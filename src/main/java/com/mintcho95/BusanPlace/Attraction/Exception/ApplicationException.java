package com.mintcho95.BusanPlace.Attraction.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationException extends RuntimeException {
    private ErrorCode errorCode;
    private String message;

    public ApplicationException(ErrorCode _input){
        this.errorCode = _input;
        this.message = _input.getMessage();
    }
}
