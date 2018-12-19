package com.jimfred.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jimfred.model.Products;
import com.jimfred.services.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/products")
	public List<Products> getProducts(){
		return productService.getProducts();
	}
	
	@RequestMapping(value="/products/{productId}")
	public Products getProduct(@PathVariable int productId) {
		return productService.getProduct(productId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProduct(@RequestBody Products product) {
		
		productService.addProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{productid}")
	public void removeProduct(@PathVariable int productId) {
		productService.removeProduct(productId);
	}
	
}
