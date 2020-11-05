package com.nibuton.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes;

	private Random random;
	
	public RandomFortuneService(String... fortunes) {
		this.fortunes = fortunes;
	}
	
	public void setRandom(Random random) {
		this.random = random;
	}

	@Override
	public String getFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}
