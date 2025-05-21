package com.app.zayyni.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@GetMapping(value = "/greet",produces = "application/text")
	public ResponseEntity<String>  greet() {
		return new ResponseEntity<String>("<h1>Hello There !!!!</h1>",HttpStatus.OK);
	}
	
	
	@GetMapping("/user")
	public User getUser() {
		return new User(1,"demouser","Lhr","63939986");
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<List<User>>(service.getUsers(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<User> insertUser(@RequestBody User usr) {
		return new ResponseEntity<User>(service.insertUser(usr),HttpStatus.CREATED);
	
	}
	
	@GetMapping("/user/{uid}")
	public ResponseEntity<User> getUserById(@PathVariable int uid) {
		return new ResponseEntity<User>(service.getUserById(uid),HttpStatus.OK);
	}
	
	
	@GetMapping("/username/{uname}")
	public ResponseEntity<User>  getUserbyName(@PathVariable String uname) {
		return new ResponseEntity<User>(service.getUserbyName(uname),HttpStatus.OK);
	}
	
	
	@PutMapping("/updateUser/{uid}")
	public ResponseEntity<User> updateUser(@PathVariable int uid, @RequestBody User usr) {
		return new ResponseEntity<User>(service.updateUser(uid, usr),HttpStatus.CREATED);
		
	}

	@DeleteMapping("/deleteUser/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable int uid) {
		
		return new ResponseEntity<String>(service.deleteUser(uid),HttpStatus.ACCEPTED);
		
	}
}
