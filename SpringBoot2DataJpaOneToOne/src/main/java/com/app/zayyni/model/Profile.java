package com.app.zayyni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Profile {
	
	@Id
	private Integer profId;
	private String idType;
	private String pcode;
	private String idNumber;
	private String addr;
	
	
	

}
