package com.jimfred.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.jimfred.model.Order;
public interface OrderRepository extends CrudRepository<Order,Integer>  {
	
	
	}
