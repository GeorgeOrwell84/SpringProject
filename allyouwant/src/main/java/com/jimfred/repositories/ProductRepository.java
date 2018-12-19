package com.jimfred.repositories;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.jimfred.model.Products;

public interface ProductRepository extends PagingAndSortingRepository<Products,Integer> {
	
}
