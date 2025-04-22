package com.app.zayyni.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.consumer.VendorRestConsumer;

@RestController
@RequestMapping("/prod")
public class ProductRestController {

	@Autowired
	private VendorRestConsumer consumer;
	
	
	@GetMapping("/data")
	public String getData() {
		System.out.println(consumer.getClass().getName());
		ResponseEntity<String> resp =consumer.showMsg();
		return "FROM PROD=> " + resp.getBody();
	}
}
