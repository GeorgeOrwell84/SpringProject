package com.jimfred.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@Column(name="product_id")
	private int productId;
	private String name;
	private float price;
	private String manufacturer;
	
//	@OneToOne(cascade=CascadeType.ALL,mappedBy="product")
//	private Order order;

	
	public Products() {
		
	}

	public Products(String name,float price, String manufacturer) {
		this.name=name;
		this.price = price;
		this.manufacturer = manufacturer;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", price=" + price + ", manufacturer="
				+ manufacturer + ", order=" + "]";
	}






	
	
	
}
