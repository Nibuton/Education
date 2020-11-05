package com.nibuton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nibuton.DAO.customerDAO;
import com.nibuton.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private customerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers(){
		return customerDAO.getMany();
	}
	
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.save(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDAO.getOne(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.delete(theId);
	}

	@Override
	@Transactional
	public List<Customer> searchCustomers(String theSearchName) {
		return customerDAO.search(theSearchName);
	}

}
