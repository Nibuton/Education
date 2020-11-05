package com.nibuton.springdemo.rest;

public class StudentNotFoundException extends RuntimeException{

	public StudentNotFoundException(String message) {
		super(message);
	}
}
