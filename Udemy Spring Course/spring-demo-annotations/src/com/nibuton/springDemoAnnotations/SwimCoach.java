package com.nibuton.springDemoAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${email}")
	private String email;
	
	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "SWIM!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
