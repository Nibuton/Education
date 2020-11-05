package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Instructor;
import com.nibuton.hibernate.demo.entity.InstructorDetail;
import com.nibuton.hibernate.demo.entity.Student;

public class DeleteDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			System.out.println("Creating new instructor object...");
			
			int id = 1;
			
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 1);
			
			System.out.println("Got instructor..." + instructor);
			
			if (instructor != null)
				session.delete(instructor);

			session.getTransaction().commit();
			
		} 
		
		finally{
			sessionFactory.close();
		}
	}
}
