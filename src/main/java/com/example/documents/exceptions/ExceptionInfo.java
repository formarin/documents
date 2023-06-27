package com.example.documents.exceptions;

import org.springframework.http.HttpStatus;

public record ExceptionInfo(
        String message,
        HttpStatus httpStatus) {

}


