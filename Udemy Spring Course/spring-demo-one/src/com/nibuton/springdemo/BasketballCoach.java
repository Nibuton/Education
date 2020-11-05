package com.nibuton.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Threepointers";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doStartStuff() {
		System.out.println("I'm starting basketball coach");
	}
	
	public void doEndStuff() {
		System.out.println("I'm ending basketball coach");
	}

}
