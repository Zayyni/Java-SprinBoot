package com.app.zayyni.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch")
public class BranchRestController {
	
	@Value("${server.port}")
	private String port;
	
	
	@GetMapping("/info")
	public ResponseEntity<String> getData(){
		return ResponseEntity.ok(" FROM BRANCH SERVICE => " + port);
	}

}
