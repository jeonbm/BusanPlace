package com.mintcho95.BusanPlace.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not found"),
    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "User name is duplicated"),
    INVALID_PERMISSION(HttpStatus.UNAUTHORIZED, "Permission is invalid"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error"),
    QUERY_EMPTY_ERROR(HttpStatus.NOT_FOUND,"입력값이 비어있습니다."),
    RESULT_EMPTY_ERROR(HttpStatus.NOT_FOUND,"결과값이 없습니다."),
    FIELD_NAME_CHECK(HttpStatus.NOT_FOUND,"필드값이 올바르지 않습니다.")
    ;

    private HttpStatus httpStatus;
    private String message;
}
