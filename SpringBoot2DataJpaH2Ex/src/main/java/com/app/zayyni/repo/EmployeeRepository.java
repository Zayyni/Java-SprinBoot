package com.app.zayyni.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.zayyni.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
