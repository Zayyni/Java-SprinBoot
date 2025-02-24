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
		
		FileSystemResource file = new FileSystemResource("C:\\Downloads\\testImage.jpg");
		boolean flag = emailUtil.send(
				"zayyni786", 
				new String[] {
						"test1@gmail.com",
						"test2@gmail.com",
						"test3@gmail.com"
				}, 
				new String[] {
						"test4@gmail.com",
						"test5@gmail.com"
				}, 
				"Sample", 
				"Hello Data!", 
				file);
		
		System.out.println("This is flag : "+ flag);
		if (flag) {
			System.out.println("SUCCESS");
		}else {
			System.out.println("FAIL");
		}
		
	}

}
