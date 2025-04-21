package com.app.zayyni.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.cosumer.BranchRestConsumer;

@RestController
@RequestMapping("/company")
public class CompanyRestController {
	
	@Autowired
	private BranchRestConsumer consumer;
	
	
	@GetMapping("/details")
	public ResponseEntity<String> viewMsg(){
		
		String body = "FROM COMPANY => " + consumer.getBranchInfo();
		return ResponseEntity.ok(body);
	};

}
