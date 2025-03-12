package com.app.zayyni.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	//=======================MULITPLE ROWS OUTPUT==========================//
	@Query("select e FROM Employee e ")
	List<Employee> getAllEmployees();
	
	@Query("select e.empName FROM Employee e ")
	List<String> getAllEmployeesName();
	
	@Query("select e.empName,e.empSal,e.empDept FROM Employee e ")
	List<Object[]> getAllEmployeesNameAndSal();
	
	//--------------------ONE ROW OUTPUT----------------//
	@Query("select e FROM Employee e where e.empId=:empId")
	Employee getEmployeeById(Integer empId);
	
	
	@Query("select e.empSal FROM Employee e where e.empName=:empName")
	Double getEmployeeSalByName(String empName);
	
	@Query("select e.empSal,e.empName FROM Employee e where e.empName=:empName")
	Object getEmployeeSalaryByName(String empName);
	
	@Query("select e.empName FROM Employee e where e.empDept=:empDept")
	List<String> getEmployeeNameByDept(String empDept);

}
