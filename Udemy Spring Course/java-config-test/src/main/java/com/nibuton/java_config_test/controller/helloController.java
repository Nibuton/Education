package com.nibuton.java_config_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class helloController {
	
	@GetMapping
	public String hello() {
		return "hello";
	}
}
