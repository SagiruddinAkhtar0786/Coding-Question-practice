package com.practice.sExceptionHandler.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason = "id did not found")
public class ExceptionHnadler extends RuntimeException {
	public ExceptionHnadler(String msg) {
		super(msg);
	}
}
