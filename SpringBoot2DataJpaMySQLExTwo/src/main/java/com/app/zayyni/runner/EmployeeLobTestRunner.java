package com.app.zayyni.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;

@Component
public class EmployeeLobTestRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		FileInputStream fis = new FileInputStream("F:\\testImage.jpg");
		// available() method returns file size in bytes
		byte[] arr = new byte[fis.available()];
		fis.read(arr);
		
		String info = "ADHYUT KYGUIUYU UYUIKNGUIGU UYHUIY NIUDYUIDJHYUID";
		
		char[] desc = info.toCharArray();
		
		repo.save(new Employee(66,"AA",arr, desc,"F:\\testImage.jpg"));
		
		fis.close();
		
		
	}
}
