package com.app.zayyni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emptab")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "eid")
	private Integer empId;
	@Column(name="ename")
	private String EmpName;
	@Column(name="esal")
	private Double empSal;
}
