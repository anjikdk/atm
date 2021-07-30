package com.mobiquity.atm.service;

import java.util.List;

import com.mobiquity.atm.model.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
}
