package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Course;
import com.nibuton.hibernate.demo.entity.Instructor;
import com.nibuton.hibernate.demo.entity.InstructorDetail;
import com.nibuton.hibernate.demo.entity.Student;

public class GetInstructorCoursesDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			int id = 1;
			
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, id);
			
			System.out.println(instructor.getCourses());
			
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
