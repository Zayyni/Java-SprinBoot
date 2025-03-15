package com.app.zayyni.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vendor {
	
	@Id
	private Integer vid;
	private String vname;
	private String vaddr;
	
	/*
	 * 
	 * 1....*
	 * Vendor --<> Contract
	 * Collection Type
	 * */
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "vid_fk")
	private List<Contract> cobs;

}
