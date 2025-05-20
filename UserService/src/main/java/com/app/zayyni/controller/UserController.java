package com.app.zayyni.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.model.User;
import com.app.zayyni.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello There !!!!";
	}
	
	
	@GetMapping("/user")
	public User getUser() {
		return new User(1,"demouser","Lhr","63939986");
	}
	
	@GetMapping("/getAllUser")
	public List<User> getUsers(){
		return service.getUsers();
	}
	
	@PostMapping("/save")
	public User insertUser(@RequestBody User usr) {
		return service.insertUser(usr);
	
	}
	
	@GetMapping("/user/{uid}")
	public User getUserById(@PathVariable int uid) {
		return service.getUserById(uid);
	}
	
	
	@GetMapping("/username/{uname}")
	public User getUserbyName(@PathVariable String uname) {
		return service.getUserbyName(uname);
	}
	
	
	@PutMapping("/updateUser/{uid}")
	public User updateUser(@PathVariable int uid, @RequestBody User usr) {
		return service.updateUser(uid, usr);
		
	}

	@DeleteMapping("/deleteUser/{uid}")
	public String deleteUser(@PathVariable int uid) {
		
		return service.deleteUser(uid);
		
	}
}
