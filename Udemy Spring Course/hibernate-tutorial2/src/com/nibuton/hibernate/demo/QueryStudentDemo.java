package com.nibuton.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Student;

public class QueryStudentDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			session.beginTransaction();
			
			List<Student> students = session.createQuery("from Student").getResultList();
			
			students = session.createQuery("from Student where lastName = 'Butov'").getResultList();
			
			students = session.createQuery("from Student where firstName like '%k%'").getResultList();
			
			displayStudents(students);
			
			session.getTransaction().commit();
			
		} finally{
			sessionFactory.close();
		}
	}

	private static void displayStudents(List<Student> students) {
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
