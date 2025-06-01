package com.app.zayyni.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer oid;
	private String name;
	private String status;
	
//	@Autowired
//	private User user;

}
