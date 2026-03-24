package com.practice.sExceptionHandler.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.practice.sExceptionHandler.exception.ResourceNotFoundEception;

@ControllerAdvice
public class HandleExceptionGlobally {

    @ExceptionHandler(ResourceNotFoundEception.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundEception ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
    
}
