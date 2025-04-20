package com.app.zayyni.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.consumer.EmployeeRestConsumer;

@RestController
@RequestMapping("/dept")
public class DeptRestController {
	
	@Autowired
	private EmployeeRestConsumer consumer;
	
	@GetMapping("/info")
	public ResponseEntity<String> getInfo(){
		String data=consumer.getEmpData();
		String body = "FROM DEPT APP!!" + data;
		return ResponseEntity.ok(body);
	};
	}	
