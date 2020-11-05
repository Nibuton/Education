package com.nibuton.springdemo;

public class VolleyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String email;
	private double salary;
	
	public VolleyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Train block";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setEmail(String email) {
		System.out.println("Setting email for VolleyCoach");
		this.email = email;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

}
