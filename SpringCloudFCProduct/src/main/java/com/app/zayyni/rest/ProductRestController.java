package com.app.zayyni.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@PostMapping("/datae")
	public String createVendor(
			@RequestBody Vendor vendor
			) {
		
//		Vendor v = new Vendor(334,"NIT","HYD");
		ResponseEntity<String> resp=consumer.saveVendor(vendor);
		return "FROM PRODUCT => " + resp.getBody();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String removeById(
			@PathVariable Integer id
			) {
		
		String resp=consumer.removeVendor(id);
		return "FROM PROD => " + resp;
	}
	
	
	@PutMapping("/update")
	public String modifyData(
			@RequestBody Vendor vendor
			) {
		ResponseEntity<String> resp =consumer.updateVendor(vendor);
		return "FROM PROD => " + resp.getBody();
	}
}
