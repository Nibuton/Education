package com.nibuton.hibernate.demo;

import com.nibuton.hibernate.demo.entity.Employee;

public class EmployeeTableSearchDemo {
	public static void main(String[] args) {
		EmployeeTableSearch employeeTableSearch = new EmployeeTableSearch();
		employeeTableSearch.save("Nikita","Butov", "A");
		employeeTableSearch.save("Katya", "Ivanova", "B");
		
		Employee employee = employeeTableSearch.get(1);
		
		employeeTableSearch.delete(employee);
		
	}
}
