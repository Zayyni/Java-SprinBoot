package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// to find Impl class Name using Reference variable 
		System.out.println(employeeRepository.getClass().getName());
		
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
		
		employeeRepository.save(new Employee(101,"AA",2500.0));
		employeeRepository.save(new Employee(102,"BB",3500.0));
		employeeRepository.save(new Employee(103,"CC",4500.0));
		
		
		// print all rows-------------
		Iterable<Employee> data = employeeRepository.findAll();
		//jdk 1.5 forEach loop
		for(Employee e:data) {
			System.out.println(e);
		}
		
	}

}
