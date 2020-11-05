package com.nibuton.springDemoAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Person {
	
	@Value("${email}")
	private String email;
	@Value("${salary}")
	private float salary;
	
	public String getEmail() {
		return email;
	}
	public float getSalary() {
		return salary;
	}
	
	@PostConstruct
	public void postC() {
		System.out.println("PostConstruction");
	}
	
	@PreDestroy
	public void preD() {
		System.out.println("PostDestroy");
	}

}
