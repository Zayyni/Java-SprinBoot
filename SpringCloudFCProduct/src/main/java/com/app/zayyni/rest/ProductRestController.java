package com.app.zayyni.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.consumer.VendorRestConsumer;
import com.app.zayyni.model.Vendor;

@RestController
@RequestMapping("/prod")
public class ProductRestController {

	@Autowired
	private VendorRestConsumer consumer;
	
	
	@GetMapping("/data")
	public String getData() {
		System.out.println(consumer.getClass().getName());
		ResponseEntity<String> resp =consumer.showMsg();
		return "FROM PROD=> " + resp.getBody();
	}
	
	
	@GetMapping("/datab")
	public String getObjData() {
		ResponseEntity<Vendor> resp = consumer.showMsgB();
		return "FROM PROD => " + resp.getBody();
	}
	
	@GetMapping("/datac")
	public String getPathData() {
		ResponseEntity<String> resp = consumer.showMsgC(100);
		return "FROM PROD => " + resp.getBody();
	}
	
	@GetMapping("/datad")
	public String getListData() {
		ResponseEntity<List<Vendor>> resp = consumer.showMsgD();
		return "FROM PROD => " + resp.getBody();
	}
}
