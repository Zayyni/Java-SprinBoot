package com.zayyni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "")
public class Employee {
	
	
	@Id
	@GeneratedValue
	private Integer eid;
	
	private String ename;
	
	private String email;
	
	private Double esal;
	private String dept;
	
	private Double hra;
	private Double da;
}
