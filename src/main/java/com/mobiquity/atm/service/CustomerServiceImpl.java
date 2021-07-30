package com.mobiquity.atm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mobiquity.atm.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{

	private static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();
	
	@Override
	public Customer createCustomer(Customer customer) {
		
		customers.put(customer.getCustId(), customer);
		
		return customers.get(customer.getCustId());
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		
		List<Customer> customerList = new ArrayList<Customer>();
		Set<Entry<Integer, Customer>> set = customers.entrySet();
		for(Entry<Integer, Customer> entry : set)
		{
			customerList.add(entry.getValue());
		}
		
//		customerList = customers.entrySet().stream().map(s -> s.getValue()).collect(Collectors.toList());
		
		return customerList;
	}
	
}
