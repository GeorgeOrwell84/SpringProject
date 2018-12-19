package com.jimfred.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@Column(name="order_id")
	private int orderId;
	
	
	@Column(name="quantity")
	private int quantity;
	
	
	
	
	
//	@ManyToOne
//	@JoinColumn(name="customer_id")
//	private Customers customers;
//	
	@OneToOne
	@JoinColumn(name="product_id")
	private Products product;
	
	
	
	
	public Order(){
		
	}
	
	

	public Order(int quantity) {
		this.quantity = quantity;
	}


	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public Products getProduct() {
		return product;
	}



	public void setProduct(Products product) {
		this.product = product;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", quantity=" + quantity + ", product=" + product + "]";
	}

	
	
	
	




	
}
