package com.nibuton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FortuneService fortuneService = context.getBean("randomFortuneService", FortuneService.class);
		System.out.println(fortuneService.getFortune());
		System.out.println(fortuneService.getFortune());
		System.out.println(fortuneService.getFortune());
		System.out.println(fortuneService.getFortune());
	}

}
