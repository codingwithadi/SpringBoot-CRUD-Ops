package com.codingwithadi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.codingwithadi.response.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	// Handle All Exception in Controller
	// ExceptionHandler is handle specific exception class or method
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<APIResponse> userNotFoundException(UserNotFoundException ex){
		
		String message = ex.getMessage();
		APIResponse response = new APIResponse(message, false);
		return new ResponseEntity<APIResponse>(response, HttpStatus.NOT_FOUND);
	}

}
