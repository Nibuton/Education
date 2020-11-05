package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Instructor;
import com.nibuton.hibernate.demo.entity.InstructorDetail;
import com.nibuton.hibernate.demo.entity.Student;

public class CreateDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			System.out.println("Creating new instructor object...");
			
			Instructor instructor = new Instructor("Nikita", "Butov", "nibuton@gmail.com");
			InstructorDetail detail = new InstructorDetail("nibuton","boardgames");
			
			Instructor instructor2 = new Instructor("Katya", "Ivanova", "ecath@gmail.com");
			InstructorDetail detail2 = new InstructorDetail("malipus","kosmetos");
			
			instructor.setInstructorDetail(detail);
			instructor2.setInstructorDetail(detail2);
			
			session.beginTransaction();
			
			System.out.println("Saving instructor..." + instructor);
			session.save(instructor);
			System.out.println("Saving instructor..." + instructor);
			session.save(instructor2);

			session.getTransaction().commit();
			
		} 
		
		finally{
			sessionFactory.close();
		}
	}
}
