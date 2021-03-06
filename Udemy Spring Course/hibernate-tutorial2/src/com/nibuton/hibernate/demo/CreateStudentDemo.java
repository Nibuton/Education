package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Student;

public class CreateStudentDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Nikita", "Butov", "nibuton@gmail.com");
			session.beginTransaction();
			System.out.println("Saving the student");
			session.save(tempStudent);
			session.getTransaction().commit();
		} finally{
			sessionFactory.close();
		}
	}
}
