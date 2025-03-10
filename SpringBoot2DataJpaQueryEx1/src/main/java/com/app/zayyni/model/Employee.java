package com.app.zayyni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "emptab")
public class Employee {
	
	@Id
	private Integer id;
	private String ename;
	private Double esal;
	private String dept;

}
