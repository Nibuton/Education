package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Instructor;
import com.nibuton.hibernate.demo.entity.InstructorDetail;
import com.nibuton.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			System.out.println("Creating new instructor object...");
			
			int id = 4;
			
			session.beginTransaction();
			
			InstructorDetail detail = session.get(InstructorDetail.class, id);
			
			System.out.println("Got and will delete details: " + detail);
			
			detail.getInstructor().setInstructorDetail(null);
			
			session.delete(detail);

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
