package com.nibuton.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nibuton.entity.Customer;


@Repository
public class customerDAO implements DAO<Customer>{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public List<Customer> getMany(){

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by lastName", Customer.class);
		return theQuery.getResultList();
	}

	@Override
	public Customer getOne(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class, id);
		return theCustomer;
	}

	@Override
	public void delete(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Customer where id = :customerId");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();
		
	}
	
	@Override
	public List<Customer> search(String theSearchName) {
		Session currentSession = sessionFactory.getCurrentSession();
		List<Customer> customers;
		if (theSearchName != null && theSearchName.trim().length() > 0) {
			Query<Customer> theQuery = currentSession.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName order by lastName", Customer.class);
			theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");
			customers = theQuery.getResultList();	
		}
		else {
			customers = getMany();
		}
		return customers;
	}
	
}
