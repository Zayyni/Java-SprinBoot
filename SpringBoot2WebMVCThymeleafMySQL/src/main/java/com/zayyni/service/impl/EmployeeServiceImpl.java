package com.zayyni.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.zayyni.exception.EmployeeNotFoundException;
import com.zayyni.model.Employee;
import com.zayyni.repo.EmployeeRepository;
import com.zayyni.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		double esal = e.getEsal();
		double hra = esal * 20/100.0;
		double da = esal * 10/100.0;
		e.setHra(hra);
		e.setDa(da);
		
		e = repo.save(e);
		return e.getEid();
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	@Override
	public void deleteEmployee(Integer id) {
		Employee e = getOneEmployee(id);
		repo.delete(e);
	}
	
	@Override
	public Employee getOneEmployee(Integer id) {
		Employee e = repo.findById(id)
				.orElseThrow(
						()-> new EmployeeNotFoundException("Employee Not Found")
						);
		return e;
	}
	
	@Override
	public void updateEmployee(Employee e) {
		if(repo.existsById(e.getEid())) {
			double esal = e.getEsal();
			double hra = esal * 20/100.0;
			double da = esal * 10/100.0;
			e.setHra(hra);
			e.setDa(da);
			repo.save(e);
		}else {
			throw new EmployeeNotFoundException("Employee" + e.getEid()  +" already exist");
		}
	}
	
	@Override
	public Page<Employee> getAllEmployees(Pageable pageable){
		Page<Employee> page = repo.findAll(pageable);
		return page;
	}

	
	
}
