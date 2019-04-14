package com.jimfred.controllers;

import java.util.*; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jimfred.model.Customers;
import com.jimfred.model.Order;
import com.jimfred.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	private List<String> names= new ArrayList<String>();
	
	

	@RequestMapping("/customers")
	public List<String> getCustomers() {

		names.add("Mike");
		names.add("Jhon");
		return names;
	}
	
	
	@RequestMapping("/customers/{id}")
	public Customers getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/customers")
	public void addCustomer(@RequestBody Customers customer){
		
		
//		
//		for (Order order : customer.getOrders()) {
//			order.setCustomers(customer);
//		}
		
		customerService.addCustomer(customer);
		
	}
	
	
	
	@RequestMapping(method= RequestMethod.DELETE,value="/customers/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.removeCustomer(id);
		
	}
	
	@RequestMapping(value="/customers/byAge/{age}")
	public List<Customers> getCustomersByAge(@PathVariable int age){
		
		 return customerService.getCustomersByAge(age);
	}
	


	

	
	
	
}
