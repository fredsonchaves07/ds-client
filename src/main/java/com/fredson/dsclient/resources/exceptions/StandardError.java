package com.fredson.dsclient.resources.exceptions;


import java.io.Serializable;

public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer codError;
    private String message;

    public StandardError() { }

    public StandardError(Integer codError, String message) {
        this.codError = codError;
        this.message = message;
    }
}
