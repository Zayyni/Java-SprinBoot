package com.app.zayyni.service;

import java.util.List;

import com.app.zayyni.model.Product;

public interface IProductService {
	
	Integer saveProduct(Product p);
	List<Product> getAllProducts();
	
	

}
