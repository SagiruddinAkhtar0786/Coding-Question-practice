package com.practice.sExceptionHandler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundEception.class)
	public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundEception ex){
		//return new ResponseEntity<>(ex.getMessage() , HttpStatus.NOT_FOUND);
		return new ResponseEntity<>("id is incorrrectly informed" , HttpStatus.NOT_FOUND);
	}

}
