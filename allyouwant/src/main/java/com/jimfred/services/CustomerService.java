package com.jimfred.services;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jimfred.model.Customers;
import com.jimfred.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	
	public Customers getCustomer(int id) {
		 
			Customers a = customerRepo.findById(id).get();
			return a;
	}
	
	public List<Customers> getCustomers(){
		
		List<Customers> customers= new ArrayList<>();
    	customerRepo.findAll().forEach(customers::add);
		return customers;
	}

	public void removeCustomer(int id) {
		customerRepo.deleteById(id);
	}

	public void addCustomer(Customers customer) {
		customerRepo.save(customer);

	}

	public List<Customers> getCustomersByAge(int age) {
		// TODO Auto-generated method stub
		List<Customers> customers= new ArrayList<>();
		customerRepo.findByAge(age).forEach(customers:: add);
		return customers;
	}
	



}
