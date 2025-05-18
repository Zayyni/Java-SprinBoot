package com.app.zayyni.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.model.User;

@RestController
public class UserController {
	
	List<User> ul = new ArrayList<>();
	
	public UserController() {
		ul.add(new User(1,"ALI","Lhr","35784856"));
		ul.add(new User(2,"USMAN","Khr","254385"));
		ul.add(new User(3,"ZIA","Isl","98936893"));
		ul.add(new User(4,"ZOHAIB","Fsd","687368768"));
		ul.add(new User(5,"JOHN","Lhr","9389368936"));
		ul.add(new User(6,"MIKE","Lhr","9389368936"));
		ul.add(new User(7,"JOHN","Lhr","93287246"));
		ul.add(new User(8,"Jef","Fsd","875826"));
	}
	
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
		return ul;
	}
	
	
	@GetMapping("/user/{uid}")
	public User getUserById(@PathVariable int uid) {
		return ul.stream().filter(u->u.getUid()== uid)
				.findFirst()
				.orElseThrow(()->new RuntimeException("User not found with id "+ uid));
	}
	
	
	@GetMapping("/username/{uname}")
	public User getUserbyName(@PathVariable String uname) {
		return ul.stream().filter(u->u.getUname().equalsIgnoreCase(uname))
				.findFirst()
				.orElseThrow(()->new RuntimeException("User not found with name "+ uname));
	}

}
