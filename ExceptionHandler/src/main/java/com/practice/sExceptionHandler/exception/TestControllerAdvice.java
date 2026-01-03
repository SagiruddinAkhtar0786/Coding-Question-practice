package com.practice.sExceptionHandler.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestControllerAdvice {
	
	@ExceptionHandler(ExceptionHnadler.class)
	public ResponseEntity<ErrorResponse> handleException(ExceptionHnadler ex){
		
		ErrorResponse errorMessage = new ErrorResponse(LocalDateTime.now(),HttpStatus.NOT_FOUND.value(),ex.getMessage() ,"there is error with ID");
		return new ResponseEntity<ErrorResponse>(errorMessage,HttpStatus.NOT_FOUND);
	}
	
	
/*	@ExceptionHandler(BugException.class)
	public ResponseEntity<ErrorResponse> handleException(BugException ex){
		
		ErrorResponse errorMessage = new ErrorResponse(LocalDateTime.now(),HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage() ,"An error Occured");
		return new ResponseEntity<ErrorResponse>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
	}
*/
}
