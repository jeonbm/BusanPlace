package com.mintcho95.BusanPlace.Exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorMessageDto {
    private HttpStatus status;
    private String message;
}
