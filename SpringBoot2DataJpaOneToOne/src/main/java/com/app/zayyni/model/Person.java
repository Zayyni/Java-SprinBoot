package com.app.zayyni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
	
	@Id
	private Integer id;
	private String fname;
	private String lname;
	private String contact;
	private String gender;
	
	
	@ManyToOne
//	@OneToOne
	@JoinColumn(name = "pr_id_fk",unique = true)
	private Profile prob; // HAS-A
	

}
