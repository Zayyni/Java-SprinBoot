package com.app.zayyni.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	
	private static final Logger LOG = LoggerFactory.getLogger(ProductRestController.class);
	
	@Autowired
	private IProductService service;
	
	@PostMapping()
	public ResponseEntity<String> saveProduct(
			@RequestBody Product product)
	{
		LOG.info("Entered Into saveProduct method");
		ResponseEntity<String> resp = null;
		try {
			Integer id = service.saveProduct(product);
			resp = new ResponseEntity<String>(
					new StringBuffer()
					.append("Product '")
					.append(id)
					.append("' saved")
					.toString(),
					HttpStatus.CREATED
					);
			LOG.info("Product Saved with ID {}",id);
			
		} catch (Exception e) {
			LOG.error("Unable to save product {}",e.getMessage());
			resp = new ResponseEntity<String>(
				"Unable to process Save Product",
				HttpStatus.INTERNAL_SERVER_ERROR
				);
			e.printStackTrace();
		}
		
		LOG.info(" ABOUT TO LEAVE SAVE PRODUCT METHOD ");
		return resp;
	}
	
	
	@GetMapping()
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list = service.getAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
}
