package com.practice.sExceptionHandler.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
	private LocalDateTime timestamp;
	private int status;
	private String message;
	private String error;
	
	
	public ErrorResponse(LocalDateTime timestamp, int status, String message, String error) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.error = error;
	}


	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
	
	
}
