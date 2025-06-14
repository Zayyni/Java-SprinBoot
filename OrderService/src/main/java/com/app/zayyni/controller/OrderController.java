package com.app.zayyni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.dao.Orders;
import com.app.zayyni.repo.OrderRepository;

@RestController
public class OrderController {
	
	@Autowired
	OrderRepository repo;
	
	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrders(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Orders saveOrder(@RequestBody Orders order) {
		return repo.save(order);
	}

}
