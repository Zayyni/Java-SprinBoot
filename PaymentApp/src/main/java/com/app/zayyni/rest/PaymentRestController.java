package com.app.zayyni.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	
	@GetMapping("/validate")
	public ResponseEntity<String> validatePayment(){
		return ResponseEntity.ok("Payment Success");
	}

}
