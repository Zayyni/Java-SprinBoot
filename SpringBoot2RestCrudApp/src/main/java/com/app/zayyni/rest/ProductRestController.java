package com.app.zayyni.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.model.Product;
import com.app.zayyni.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductRestController {
	
	@Autowired
	private IProductService service;
	
	@PostMapping()
	public ResponseEntity<String> saveProduct(
			@RequestBody Product product)
	{
		Integer id = service.saveProduct(product);
		
		return new ResponseEntity<String>("Product Saved "+id,HttpStatus.OK);
	}
	
	
	@GetMapping()
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list = service.getAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
}
