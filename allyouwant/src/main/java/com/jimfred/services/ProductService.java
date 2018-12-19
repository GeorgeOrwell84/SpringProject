package com.jimfred.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jimfred.model.Products;
import com.jimfred.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	
	
	public List<Products> getProducts(){
		List<Products> products= new ArrayList<>();
		productRepo.findAll().forEach(products::add);
		return products;
	}
	
	public Products getProduct(int productId) {
		return productRepo.findById(productId).get();
	}
	
	public void addProduct(Products product) {
		productRepo.save(product);
	}
	
	public void removeProduct(int productId) {
		productRepo.deleteById(productId);
	}
	
}
