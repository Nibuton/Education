package com.nibuton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(""
				+ "applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		VolleyCoach theSecondCoach = context.getBean("mySecondCoach", VolleyCoach.class);
		
		Coach theThirdCoach = context.getBean("myThirdCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theSecondCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(((FootballCoach) theThirdCoach).getSalary());
		
		System.out.println(theSecondCoach.getEmail());
		
		context.close();
		
	}

}
