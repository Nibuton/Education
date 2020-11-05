package com.nibuton.springDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 Person person = context.getBean("person", Person.class);
	 Person human = context.getBean("person", Person.class);
	 System.out.println(person.getEmail());
	 System.out.println(human.getSalary());
	 System.out.println(person == human);
	 context.close();
	}

}
