package com.app.zayyni.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;

//@Component
public class EmployeeDateTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
//		Date dt = new Date(System.currentTimeMillis());
//		System.out.println(dt);
//		
//		Employee emp = new Employee(55,"SAM",dt,dt,dt);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
//		String dts = sdf.format(dt);
//		System.out.println(dts);
//		
//		repo.save(emp);
	}

}
