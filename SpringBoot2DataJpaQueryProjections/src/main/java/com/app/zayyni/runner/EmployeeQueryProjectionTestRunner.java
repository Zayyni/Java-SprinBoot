package com.app.zayyni.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.EmployeeRepository;

@Component
public class EmployeeQueryProjectionTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
//		List<Employee> list = repo.getAllEmployees();
//		list.forEach(System.out::println);
		
//		List<String> list = repo.getAllEmployeesName();
//		list.forEach(System.out::println);
		/*List<Object[]> list = repo.getAllEmployeesNameAndSal();
		list
		.stream()
		.map(ob->ob[0] + "/" + ob[1]+ "/" +ob[2]) // converts one type to another type
		.forEach(System.out::println);
		
		for(Object[] ob:list) {
			System.out.println(ob[0] + "-" + ob[1]);
		}*/
		
//		Employee e = repo.getEmployeeById(101);
//		System.out.println(e);
		
//		Double d = repo.getEmployeeSalByName("B");
//		System.out.println(d);
		
//		Object ob[] = (Object[])repo.getEmployeeSalaryByName("B");
//		System.out.println(ob[0]+"-"+ob[1]);
		
		List<String> l = repo.getEmployeeNameByDept("DEV");
		System.out.println(l);

	}

}
