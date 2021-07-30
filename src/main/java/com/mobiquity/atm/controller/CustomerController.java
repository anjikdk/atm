package com.mobiquity.atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiquity.atm.model.Customer;
import com.mobiquity.atm.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
}
