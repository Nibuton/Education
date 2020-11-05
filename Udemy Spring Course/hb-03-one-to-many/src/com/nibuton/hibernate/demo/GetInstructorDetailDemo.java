package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Instructor;
import com.nibuton.hibernate.demo.entity.InstructorDetail;
import com.nibuton.hibernate.demo.entity.Student;

public class GetInstructorDetailDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			System.out.println("Creating new instructor object...");
			
			int id = 2;
			
			session.beginTransaction();
			
			InstructorDetail detail = session.get(InstructorDetail.class, id);
			
			System.out.println("Got details: " + detail);
			
			Instructor instructor = detail.getInstructor();
			
			System.out.println("Got also an instructor: " + instructor);

			session.getTransaction().commit();
			
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally{
			
			session.close();
			
			sessionFactory.close();
		}
	}
}
