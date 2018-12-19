package com.jimfred.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jimfred.model.Customers;

public interface CustomerRepository extends CrudRepository<Customers,Integer> {
	public List<Customers> findByAge(int age);

}



