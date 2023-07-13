package com.example.documents.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(value = {UserException.class})
    public ResponseEntity<Object> handleUserException(UserException userException) {
        ExceptionInfo exceptionInfo = new ExceptionInfo(
                userException.getMessage(),
                userException.getHttpStatus());

        return new ResponseEntity<>(exceptionInfo, userException.getHttpStatus());
    }
}
