package com.fredson.dsclient.resources.exceptions;

import com.fredson.dsclient.services.exception.BadRequestErrorException;
import com.fredson.dsclient.services.exception.ServerErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(BadRequestErrorException.class)
    public ResponseEntity<StandardError> badRequest(BadRequestErrorException error) {
        StandardError standardError = new StandardError(error.getCodError(), error.getMessage());
        return ResponseEntity.status(error.getCodError()).body(standardError);
    }

    @ExceptionHandler(ServerErrorException.class)
    public ResponseEntity<StandardError> serverError(ServerErrorException error) {
        StandardError standardError = new StandardError(error.getCodError(), error.getMessage());
        return ResponseEntity.status(error.getCodError()).body(standardError);
    }
}
