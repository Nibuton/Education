package com.nibuton.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Student;

public class DeleteStudentDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			int studentId = 1;
			
			session.beginTransaction();
			
			/* Student student = session.get(Student.class, studentId);
			
			System.out.println("Get complete: " + student.getId());
			
			System.out.println("Deleting student...");
			
			session.delete(student); */
			
			session.createQuery("delete from Student where id = 5").executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		} 
		
		finally{
			
			sessionFactory.close();
		}
	}
}
