package com.nibuton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach first = context.getBean("myCoach", Coach.class);
		Coach second = context.getBean("myCoach", Coach.class);
		System.out.println(first == second);
		System.out.println(first);
		System.out.println(second);
		System.out.println(first.getDailyFortune());
		context.close();
		System.out.println(first.getDailyFortune());
		

	}

}
