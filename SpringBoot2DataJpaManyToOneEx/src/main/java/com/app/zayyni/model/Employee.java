package com.app.zayyni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	private Integer id;
	private String name;
	private Double sal;
	
	
	// *...1
	//Employee---<> Dept
	
	@ManyToOne
	@JoinColumn(name = "didFk")
	private Dept dob;

}
