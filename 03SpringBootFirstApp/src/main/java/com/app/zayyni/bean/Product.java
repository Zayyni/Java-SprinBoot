package com.app.zayyni.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Product {
	
	@Autowired(required = false)
	private Vendor vob;

}
