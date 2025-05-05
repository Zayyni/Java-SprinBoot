package com.app.zayyni.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Product {
	
	@Id
	private String id;
	
	private Integer pid;
	private String pcode;
	private Double pcost;
	
	
	private List<String> colors;
	private Map<String,Integer> mcodes;
	
	private Vendor vob;//HAS-A
	
	private List<Customer> cobs;

}
