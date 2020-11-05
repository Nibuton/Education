package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Course;
import com.nibuton.hibernate.demo.entity.Instructor;
import com.nibuton.hibernate.demo.entity.InstructorDetail;
import com.nibuton.hibernate.demo.entity.Student;

public class CreateCoursesDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			System.out.println("Creating new courses objects...");
			
			int id = 1;
			
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, id);
			Course course1 = new Course("Drum course");
			Course course2 = new Course("BoardGaming course");
			
			instructor.addCourse(course1);
			instructor.addCourse(course2);
			
			session.save(course1);
			session.save(course2);

			session.getTransaction().commit();
			
		} 
		
		finally{
			session.close();
			sessionFactory.close();
		}
	}
}
