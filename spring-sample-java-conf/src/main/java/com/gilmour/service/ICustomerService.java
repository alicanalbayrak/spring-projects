package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Customer;

/**
 * Created by alicana on 02/03/2017.
 */
public interface ICustomerService {
	List<Customer> findAll();
}
