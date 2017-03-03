package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Customer;
import com.gilmour.repository.HibernateCustomerRepositoryImpl;
import com.gilmour.repository.ICustomerRepository;

/**
 * This is going to be where my business logic will reside. Heart of the web service!
 */
public class CustomerServiceImpl implements ICustomerService {

	private ICustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
