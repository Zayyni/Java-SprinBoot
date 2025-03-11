package com.app.zayyni.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Employee {
	
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;
	
	

}
