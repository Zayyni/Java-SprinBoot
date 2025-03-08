package com.app.zayyni.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;

/**
 * Author --> Zayyni
 * */

@Component
public class EmployeeTestRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// to find Impl class Name using Reference variable 
//		System.out.println(employeeRepository.getClass().getName());
		
//		---- insert data---------------
//		Employee emp = new Employee();
//		emp.setEmpId(101);
//		emp.setEmpName("ABC");
//		emp.setEmpSal(2500.0);
//		employeeRepository.save(emp);
		
		
////		using parameterized constructor
//		
//		Employee e1 = new Employee(102,"AA",2500.0);
//		employeeRepository.save(e1);
		
//		employeeRepository.save(new Employee(101,"AA",2500.0));
//		employeeRepository.save(new Employee(102,"BB",3500.0));
//		employeeRepository.save(new Employee(103,"CC",4500.0));
//		
//		
//		// print all rows-------------
//		Iterable<Employee> data = employeeRepository.findAll();
//		//jdk 1.5 forEach loop
//		for(Employee e:data) {
//			System.out.println(e);
//		}
		employeeRepository.saveAll(Arrays.asList(
				new Employee (null,"A",2.3),
				new Employee (null,"B",3.3),
				new Employee (null,"C",4.3),
				new Employee (null,"D",5.3),
				new Employee (null,"E",6.3),
				new Employee (null,"F",7.3)
				));
		
		//read one row data
		Optional<Employee> opt= employeeRepository.findById(4);
		if (opt.isPresent()) {
			Employee e = opt.get();
			System.out.println(e);
		}else {
			System.out.println("DATA NOT FOUND");
		}
		
		// check if record exits or not by Id
		boolean result = employeeRepository.existsById(1);
		System.out.println(result);
		
		System.out.println("-------------------------");
		Iterable<Employee> emps = employeeRepository.findAll();
		
		//Using Iterator
		Iterator<Employee> itr =  emps.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
			
		}
		System.out.println("-------------------------");
		//JDK 1.8 Lambda Expression
		emps.forEach(e->System.out.println(e));
		System.out.println("========================");
		
		
		//JDK 1.8 Using Method References
		emps.forEach(System.out::println);
		
		System.out.println("-------------------------" + emps.getClass());
		
		
		// Find all by id
		Iterable<Employee> itre =  employeeRepository.findAllById(Arrays.asList(1,2,4,5));
		itre.forEach(System.out::println);
		System.out.println(employeeRepository.count());
		
		//stop-server
		System.exit(0);
		
		
	}

}
