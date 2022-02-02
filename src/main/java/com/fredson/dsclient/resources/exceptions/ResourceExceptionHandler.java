package com.fredson.dsclient.resources.exceptions;

import com.fredson.dsclient.services.exception.BadRequestErrorException;
import com.fredson.dsclient.services.exception.ServerErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(BadRequestErrorException.class)
    public ResponseEntity<BadRequestErrorException> badRequest(BadRequestErrorException error) {
        return ResponseEntity.status(error.getCodError()).body(error);
    }

    @ExceptionHandler(ServerErrorException.class)
    public ResponseEntity<ServerErrorException> serverError(ServerErrorException error) {
        return ResponseEntity.status(error.getCodError()).body(error);
    }
}
