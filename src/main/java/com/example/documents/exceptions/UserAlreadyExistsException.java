package com.example.documents.exceptions;

import org.springframework.http.HttpStatus;

public class UserAlreadyExistsException extends UserException {
    public UserAlreadyExistsException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }
}
