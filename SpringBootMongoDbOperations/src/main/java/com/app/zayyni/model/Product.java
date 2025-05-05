package com.app.zayyni.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Product {
	
	@Id
	private String id;
	
	private Integer pid;
	private String pcode;
	private Double pcost;

}
