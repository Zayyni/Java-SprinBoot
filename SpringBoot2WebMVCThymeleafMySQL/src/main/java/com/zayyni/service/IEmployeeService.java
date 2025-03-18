package com.zayyni.service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.zayyni.model.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployees();
	
	void deleteEmployee(Integer id);
	
	Employee getOneEmployee(Integer id);
	void updateEmployee(Employee e);
	
	Page<Employee> getAllEmployees(Pageable pageable);

}
