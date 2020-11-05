package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Student;

public class UpdateStudentDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			int studentId = 1;
			
			session.beginTransaction();
			
			Student student = session.get(Student.class, studentId);
			
			System.out.println("Get complete: " + student);
			
			System.out.println("Updating student...");
			
			student.setFirstName("Popa");

			session.getTransaction().commit();
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			System.out.println("Update all students");
			
			session.createQuery("update Student set email = '123@mail.ru'").executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		} 
		
		finally{
			
			sessionFactory.close();
		}
	}
}
