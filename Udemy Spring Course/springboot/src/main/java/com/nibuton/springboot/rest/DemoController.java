package com.nibuton.springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello(@Value("${name}") String name) {
		return "Hello, " + name;
	}

}
