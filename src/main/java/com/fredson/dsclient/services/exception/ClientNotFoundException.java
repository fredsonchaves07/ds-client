package com.fredson.dsclient.services.exception;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class ClientNotFoundException extends BadRequestErrorException {

    private Integer codError = HttpStatus.NOT_FOUND.value();
    private String message = "Client not found";

    public ClientNotFoundException() {
        super();
    }

    @Override
    public Integer getCodError() {
        return codError;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
