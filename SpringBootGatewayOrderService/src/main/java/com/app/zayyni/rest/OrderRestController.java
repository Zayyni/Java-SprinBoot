package com.app.zayyni.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderRestController {
	
	@Value("${server.port}")
	private String port;
	
	
	@GetMapping("/process")
	public ResponseEntity<String> processOrder(){
		return ResponseEntity.ok("ORDER PROCESSING .. " + port);
	}

}
