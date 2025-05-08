package com.app.zayyni.rest;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class PaymentRestController {
	
	private Logger log = LoggerFactory.getLogger(PaymentRestController.class);
	
	@GetMapping("/pay")
	@CircuitBreaker(fallbackMethod = "doDummyPayment",name = "paymentCircuitBreaker")
	public String doPayment() {
		log.info("Process Started....");
		if(new Random().nextInt(10)<15) {
			throw new RuntimeException("DUMMY EXCEPTION");
		}
		log.info("Process Finished....");
		return "SUCCESS";
	}

	public String doDummyPayment(Throwable t) {
	    log.info("FROM DUMMY PAYMENT SERVICE..... Exception: {}", t.getMessage());
	    return "Please try after sometime!!!";
	}

	
	
}
