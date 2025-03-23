package com.app.zayyni.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestContoller {
	
	
	
	@GetMapping("/find/id")
	public String showDataA()
	{
		
		return "Data is STATIC";
	}

	@GetMapping("/find/{id}")
	public String showDataB(
			@PathVariable Integer id
			)
	{
		System.out.println(id);
		return "Data is "+  id;
	}
	
	
	@GetMapping("/update/{code}/{model}")
	public String updateData(
			@PathVariable String code, 
			@PathVariable String model
			) {
		return "DONE : code : " + code + " Model: " + model;
	}
	
}
