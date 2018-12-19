package com.jimfred.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jimfred.model.Order;
import com.jimfred.repositories.OrderRepository;
import com.jimfred.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private ProductRepository productRepo;
	
	public Order getOrder(int id) {
			
			return orderRepo.findById(id).get();
		}
	
	public List<Order> getOrders(){
		List<Order> orders= new ArrayList<>();
		orderRepo.findAll().forEach(orders::add);
		return orders;
	}
	
	public void addOrder(Order order) {
		
		
//		productRepo.save(order.getProduct());
		orderRepo.save(order);
	}
	
	public void removeOrder(int orderId) {
		orderRepo.deleteById(orderId);
	}
	
}
