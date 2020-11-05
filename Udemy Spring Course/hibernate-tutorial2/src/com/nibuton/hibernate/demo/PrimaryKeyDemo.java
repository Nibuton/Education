package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			System.out.println("Creating new student object...");
			Student tempStudent1 = new Student("Nikita", "Butov", "nibuton@gmail.com");
			Student tempStudent2 = new Student("Katya", "Ivanova", "ecath@gmail.com");
			Student tempStudent3 = new Student("Mikhail", "Butov", "m.butov@gmail.com");
			session.beginTransaction();
			System.out.println("Saving the student");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.getTransaction().commit();
		} finally{
			sessionFactory.close();
		}
	}

}
