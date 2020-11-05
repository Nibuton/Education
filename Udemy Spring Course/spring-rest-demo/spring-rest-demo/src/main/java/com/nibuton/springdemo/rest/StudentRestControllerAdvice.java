package com.nibuton.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestControllerAdvice {
	
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> studentNotFoundExceptionHandler(StudentNotFoundException exc){
		
		StudentErrorResponse response = new StudentErrorResponse();
		
		response.setMessage(exc.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> studentExceptionHandler(Exception exc){
		
		StudentErrorResponse response = new StudentErrorResponse();
		
		response.setMessage(exc.getMessage());
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}
	
	
}
