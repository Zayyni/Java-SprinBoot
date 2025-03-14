package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Dept;
import com.app.zayyni.model.Employee;
import com.app.zayyni.repo.DeptRepository;
import com.app.zayyni.repo.EmployeeRepository;

@Component
public class DateInsertRunner implements CommandLineRunner {

	@Autowired
	private DeptRepository drepo;
	
	@Autowired
	private EmployeeRepository erepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Dept d1 = new Dept(550,"DEV");
		Dept d2 = new Dept(551,"BA");
		
		Employee e1 = new Employee(10,"A",300.0,d1);
		Employee e2 = new Employee(11,"B",4000.0,d1);
		
		Employee e3 = new Employee(12,"C",3500.0,d2);
		Employee e4 = new Employee(13,"D",4700.0,d2);
		
		
		// save child first then parent
		
		drepo.save(d1);
		drepo.save(d2);
		
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		
		System.out.println("_______________DONE____________");

	}

}
