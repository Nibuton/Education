package com.nibuton.springDemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HandballCoach implements Coach {
	
	FortuneService fortuneService;
	
	@Autowired
	public HandballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Train your running skill";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
