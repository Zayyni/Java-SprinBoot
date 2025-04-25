package com.app.zayyni.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	
	
	@Value("${my.app.title}")
	private String title;
	
	
	@GetMapping("/msg")
	public String showMsg() {
		return "WELCOME TO APP => " + title;
	}

}
