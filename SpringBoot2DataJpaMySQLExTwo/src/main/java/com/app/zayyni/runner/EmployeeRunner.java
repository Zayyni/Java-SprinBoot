package com.app.zayyni.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;
/**
 * @author Zayyni
 * */


@Component
public class EmployeeRunner implements CommandLineRunner {

//	@Autowired
//	private EmployeeRepository repo;
//	
//	@Override
	public void run(String... args) throws Exception {
//		repo.saveAll(Arrays.asList(
//				new Employee(101,"SAM","DEV",300.0),
//				new Employee(102,"SYED","QA",200.0),
//				new Employee(103,"ALI","DEV",100.0),
//				new Employee(104,"ZIA","HR",400.0),
//				new Employee(105,"ZOHAIB","DEV",500.0),
//				new Employee(106,"ISLAM","BA",600.0)
//				));
//		List<Employee> list = repo.findAll();
//		list.forEach(System.out::println);
//		
//		System.out.println("---------------------------------");
//		
//		Employee emp = new Employee();
////		emp.setDept("DEV");
//		emp.setSal(400.0);
//		
//		Example<Employee> ex = Example.of(emp);
//		List<Employee> listEx = repo.findAll(ex);
//		listEx.forEach(System.out::println);
//		
//		

	}

}
