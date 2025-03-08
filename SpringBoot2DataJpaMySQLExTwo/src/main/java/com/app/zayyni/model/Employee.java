package com.app.zayyni.model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private Integer id;
	private String name;
//	private String dept;
//	private Double sal;
	
//	@Temporal(TemporalType.DATE)
//	private Date dteA;
//	@Temporal(TemporalType.TIME)
//	private Date dteB;
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date dteC;
	
	@Lob //BLOB
	private byte[] eimg;
	@Lob //CLOB
	private char[] edesc;
	
	private String imgLoc;
}
