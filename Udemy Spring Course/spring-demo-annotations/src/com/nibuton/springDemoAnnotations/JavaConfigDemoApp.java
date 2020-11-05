package com.nibuton.springDemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach myNewCoach = context.getBean("handballCoach", Coach.class);
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myNewCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyFortune());
		context.close();
	}

}
