package com.nibuton.DAO;

import java.util.List;

import com.nibuton.entity.Customer;

public interface DAO <T> {
	
	List<T> getMany();
	T getOne(int id);
	void save(T theValue); 
	void delete(int id);
	List<T> search(String theSearchName);
}
