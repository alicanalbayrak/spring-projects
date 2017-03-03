package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Customer;
import com.gilmour.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
/**
 * This is going to be where my business logic will reside. Heart of the web service!
 */ public class CustomerServiceImpl implements ICustomerService {

	@Autowired private ICustomerRepository customerRepository;

	// =========================
	// Constructor injection
	//	@Autowired
	// =========================
	//	public CustomerServiceImpl(ICustomerRepository customerRepository) {
	//		this.customerRepository = customerRepository;
	//	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//	@Autowired
	//	public void setCustomerRepository(ICustomerRepository customerRepository) {
	//		this.customerRepository = customerRepository;
	//	}
}
