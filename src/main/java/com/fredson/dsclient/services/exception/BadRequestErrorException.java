package com.fredson.dsclient.services.exception;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class BadRequestErrorException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer codError = HttpStatus.BAD_REQUEST.value();
    private String message = "Bad request error";

    public BadRequestErrorException() {
    }

    public Integer getCodError() {
        return codError;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
