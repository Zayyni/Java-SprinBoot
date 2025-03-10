package com.app.zayyni.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT e FROM Employee e")
	List<Employee> getAllEmployees();
	
	// Positional Parameter ?1
	@Query("SELECT e FROM Employee e WHERE dept=?1")
	List<Employee> getAllEmployeesByDept(String dept);
	
	@Query("SELECT e FROM Employee e WHERE e.dept = ?1 OR e.id = ?2")
	List<Employee> getAllEmployeesInfo(String dept, Integer id);
	
	
	//Fetch data from range
	@Query("SELECT e FROM Employee e WHERE id between ?1  and ?2")
	List<Employee> getAllEmployeesInfo2(Integer id1, Integer id2);
	
	// Named Parameter (:anyName -> must match with method params)
	@Query("SELECT e FROM Employee e WHERE id between :id1  and :id2 ")
	List<Employee> getAllEmployeesInfo3(Integer id1, Integer id2);
	
	//In operator to fetch data in selected order
	@Query("SELECT e FROM Employee e WHERE id in (:inputs) ")
	List<Employee> getAllEmployeesInfo4(List<Integer> inputs);

}
