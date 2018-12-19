package com.jimfred.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jimfred.model.Order;
import com.jimfred.services.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping("/orders/{id}")
	public Order getOrder(@PathVariable int id) {
		return orderService.getOrder(id);
	}
	
	@RequestMapping("/orders")
	public List<Order> getOrders(){
		return orderService.getOrders();
	}
	
	@RequestMapping(value="/orders",method=RequestMethod.POST)
	public void addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
	}
	
	
	
	
}
