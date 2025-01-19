package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.app.zayyni.util.EmailUtil;


@Component
public class TestEmailRunner implements CommandLineRunner{
	
	@Autowired
	private EmailUtil emailUtil;
	
	@Override
	public void run(String... args) throws Exception{
		
		FileSystemResource file = new FileSystemResource("C:\\Users\\Admin\\Downloads\\test.jpg");
		
		boolean flag = emailUtil.send("mailtosend@gmail.com", 
				null, null, "SAMPLE", "Hello Data", file);
		
		if (flag) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		
	}
	

}
