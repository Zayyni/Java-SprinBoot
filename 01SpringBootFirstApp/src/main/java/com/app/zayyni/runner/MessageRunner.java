package com.app.zayyni.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class MessageRunner implements CommandLineRunner {
	
	
	public void run(String... args) throws Exception {
		System.out.println("FROM MESSAGE RUNNER");
		
	}

}
