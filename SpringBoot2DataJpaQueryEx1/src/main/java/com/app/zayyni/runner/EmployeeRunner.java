package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;

//@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(10,"SAM",5800.0,"DEV"));
		repo.save(new Employee(11,"ABD",4500.0,"DEV"));
		repo.save(new Employee(12,"XYZ",8800.0,"QA"));
		repo.save(new Employee(13,"ASD",9855.0,"QA"));
		repo.save(new Employee(14,"JKL",8600.0,"BA"));
		repo.save(new Employee(15,"MNO",7200.0,"DEV"));
		
		
		System.out.println("_____________DONE_____________");

	}

}
