package com.app.zayyni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.app.zayyni.service.AlertSystem;

public class TestProfileAnno implements CommandLineRunner {
	
	@Autowired
	private AlertSystem als;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		als.sendMessage();

	}

}
