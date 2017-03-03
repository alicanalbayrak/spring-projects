package com.gilmour.repository;

import java.util.ArrayList;
import java.util.List;

import com.gilmour.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customerList = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("ali can");
		customer.setLastName("albayrak");

		customerList.add(customer);

		return customerList;
	}

}
