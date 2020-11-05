package com.nibuton.springDemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("badFortuneService")
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout(){
		return "Ace throw";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	@Autowired
	@Qualifier("badFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I'm in setter");
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	@Qualifier("badFortuneService")
	public void method(FortuneService fortuneservice) {
		System.out.println("HeyHeyHey");
	}

}
