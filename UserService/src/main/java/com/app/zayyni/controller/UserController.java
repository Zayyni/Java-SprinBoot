package com.app.zayyni.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.model.User;

@RestController
public class UserController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello There !!!!";
	}
	
	
	@GetMapping("/user")
	public User getUser() {
		return new User(1,"demouser","Lhr");
	}

}
