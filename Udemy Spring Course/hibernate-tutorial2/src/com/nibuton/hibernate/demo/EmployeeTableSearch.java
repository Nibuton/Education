package com.nibuton.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nibuton.hibernate.demo.entity.Employee;

public class EmployeeTableSearch {
	
	private SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
	
	public void save(String firstName, String lastName, String company) {
		Employee employee = new Employee(firstName, lastName, company);
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}
	
	public Employee get(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		session.getTransaction().commit();
		return employee;
	}
	
	public void delete(Employee employee) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();
	}
	
	public List<Employee> searchByCompany(String company) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Employee> employees = session.createQuery("from Student where company = " + company).getResultList();
		session.getTransaction().commit();
		return employees;
	}
	

}
