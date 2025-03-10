package com.app.zayyni.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.repo.EmployeeRepository;

@Component
public class EmpoyeeTestQueryRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
//		repo.getAllEmployees().forEach(System.out::println);
//		repo.getAllEmployeesByDept("DEV").forEach(System.out::println);
//		repo.getAllEmployeesInfo("DEV",10).forEach(System.out::println);
		
//		repo.getAllEmployeesInfo2(10,13).forEach(System.out::println);
//		repo.getAllEmployeesInfo3(10,14).forEach(System.out::println);
		repo.getAllEmployeesInfo4(Arrays.asList(10,13,14,16)).forEach(System.out::println);
	}

}
