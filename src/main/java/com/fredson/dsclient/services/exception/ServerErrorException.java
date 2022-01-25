package com.fredson.dsclient.services.exception;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class ServerErrorException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer codError = HttpStatus.INTERNAL_SERVER_ERROR.value();
    private String message = "Server error";

    public ServerErrorException(String message) {
        super(message);
    }

    public Integer getCodError() {
        return codError;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
