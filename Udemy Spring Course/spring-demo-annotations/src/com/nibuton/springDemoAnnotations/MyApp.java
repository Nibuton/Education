package com.nibuton.springDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach myNewCoach = context.getBean("handballCoach", Coach.class);
		System.out.println(myCoach == myNewCoach);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myNewCoach.getDailyFortune());
		context.close();
	}

}
