package com.practice.sExceptionHandler.exception;

public class ResourceNotFoundEception  extends RuntimeException{
	public ResourceNotFoundEception(String msg) {
		super(msg);
	}
}
