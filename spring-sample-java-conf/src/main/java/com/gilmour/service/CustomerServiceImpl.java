package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Customer;
import com.gilmour.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

// =========================
// Auto wire
//@Service("customerService")
// =========================

/**
 * This is going to be where my business logic will reside. Heart of the web service!
 */
public class CustomerServiceImpl implements ICustomerService {

	//	@Autowired - Member level
	private ICustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Autowired
	public void setCustomerRepository(ICustomerRepository customerRepository) {
		System.out.println("Setter injection executed");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
