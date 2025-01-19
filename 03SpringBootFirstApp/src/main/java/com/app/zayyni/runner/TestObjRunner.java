package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.bean.Product;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private Product product;
	
	public void run(String... args) throws Exception {
		System.out.println(product);

		
	}
}
