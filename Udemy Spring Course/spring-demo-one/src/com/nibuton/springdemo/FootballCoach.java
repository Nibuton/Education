package com.nibuton.springdemo;

public class FootballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	private String email;
	private double salary;

	
	public FootballCoach() {}
	
	@Override
	public String getDailyWorkout() {
		return "Do ball handling practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I'm spring and I am inside a setter of FootballCoach!");
		this.fortuneService = fortuneService;
	}
	
	public void setEmail(String email) {
		System.out.println("Setting email");
		this.email = email;
	}

	public void setSalary(double salary) {
		System.out.println("Setting salary");
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
