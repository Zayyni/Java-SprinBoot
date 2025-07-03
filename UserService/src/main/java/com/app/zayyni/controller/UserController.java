package com.app.zayyni.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
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
	
	@GetMapping(value = "/greet",produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String>  greet() {
		return new ResponseEntity<String>("<h1>Hello There !!!!</h1>",HttpStatus.OK);
	}
	
	
	@GetMapping("/user")
	public User getUser() {
		return new User(1,"demouser","Lhr","63939986");
	}
	
	
	@GetMapping("/userpage/{pageSize}/{pageNo}")
	public ResponseEntity<List<User>> getUsersByPage(@PathVariable int pageSize,@PathVariable int pageNo){
		return new ResponseEntity<List<User>>(service.getUserByPage(pageNo, pageSize),HttpStatus.OK);
		
	};
	
	
	@GetMapping("/userBySort/{sort}")
	public ResponseEntity<List<User>> getUsersBySort(@PathVariable String sort){
		return new ResponseEntity<List<User>>(service.getUserBySort(sort),HttpStatus.OK);
		
	};
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<List<User>>(service.getUsers(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
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
	
	@GetMapping("/unameaddr/{uname}/{addr}")
	public ResponseEntity<User>  getUserbyNameAndAddr(@PathVariable String uname,@PathVariable String addr) {
		return new ResponseEntity<User>(service.getUnameAndAddr(uname,addr),HttpStatus.OK);
	}
	
	@GetMapping("/address/{addr}")
	public ResponseEntity<List<User>>  getUserbyAddress(@PathVariable String addr) {
		return new ResponseEntity<List<User>>(service.getUserbyAddr(addr),HttpStatus.OK);
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
