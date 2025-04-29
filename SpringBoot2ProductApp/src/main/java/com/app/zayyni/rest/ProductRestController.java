package com.app.zayyni.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class ProductRestController {

	
	@GetMapping("/show")
	public String showData() {
		
		return "FROM PRODUCT";
	};
	
	
}
