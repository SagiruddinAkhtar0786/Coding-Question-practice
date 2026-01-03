package com.practice.sExceptionHandler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason = "employeee id Not Found") // if we dont use @ResponseStatus and
//we run the application for id =0 then 500 internal error will come , so to get exact status code use responseStatus annotation, 404 not found status we get then
public class CustomExceptionHandle extends RuntimeException{
	public CustomExceptionHandle(String message) {
		super(message);
	}
	
}
