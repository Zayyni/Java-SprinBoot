package com.app.zayyni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestObjRunner implements CommandLineRunner {
	
	@Autowired
	private EmailConfig em;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(em);

	}

}
