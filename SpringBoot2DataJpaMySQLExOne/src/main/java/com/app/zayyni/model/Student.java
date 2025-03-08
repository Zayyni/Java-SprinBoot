package com.app.zayyni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stdtab")
public class Student {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "sname",length = 25)
	private String sname;
	@Column(name = "scourse", length = 30,nullable = false)
	private String course;
	@Column(name = "sfee")
	private Double fee;

}
