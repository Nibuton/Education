package com.nibuton.service;

import java.util.List;

import com.nibuton.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);

	List<Customer> searchCustomers(String theSearchName);
}
