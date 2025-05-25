package com.app.zayyni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.dao.Product;
import com.app.zayyni.dao.ProductDao;

@RestController
public class ProductController {
	
	@Autowired
	ProductDao dao;
	
	@GetMapping("/products")
	public List<Product> findAll(){
		return dao.getProducts();
		
	}
	
	@GetMapping("/product/{id}")
	public Product findProduct(@PathVariable Integer id) {
		return dao.findProduct(id);
	}
	
	@PostMapping("/product")
	public String saveProduct(@RequestBody Product p) {
		return dao.saveProduct(p);
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		return dao.deleteProduct(id);
	}

}
