package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;

//@Component
public class EmployeeInsertRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Employee(101,"A",2.2,"DEV"));
		repo.save(new Employee(102,"B",3.2,"DEV"));
		repo.save(new Employee(103,"C",4.2,"QA"));
		repo.save(new Employee(104,"D",5.2,"QA"));
		
		
	}

}
