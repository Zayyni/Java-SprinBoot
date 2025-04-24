package com.app.zayyni.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.model.Vendor;

@RestController
@RequestMapping("/vendor")
public class VendorRestController {

	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/msg")
	public ResponseEntity<String> showMsg(){
		return ResponseEntity.ok("WELCOME TO VENDOR!!! " + port);
	};
	
	@GetMapping("/obj")
	public ResponseEntity<Vendor> showMsgB(){
		return ResponseEntity.ok(new Vendor(10,"A","HYD"));
	};
	
	@GetMapping("/input/{id}")
	public ResponseEntity<String> showMsgC(@PathVariable("id") Integer id){
		return ResponseEntity.ok("Vendor for id is => "+id);
	};
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Vendor>> showMsgD(){
		return ResponseEntity.ok(
				Arrays.asList(
				
				new Vendor(10,"A","HYD"),
				new Vendor(11,"B","HYD"),
				new Vendor(12,"C","HYD")
				));
	};
	
	
	@PostMapping("/create")
	public ResponseEntity<String> saveVendor(@RequestBody Vendor vendor){
		
		String body = "Data is => "+vendor;
		System.out.println(body);
		return ResponseEntity.ok(body);
	};
	
	
	@DeleteMapping("/remove/{id}")
	public String removeVendor(@PathVariable Integer id) {
		
		
		return "Deleted Successfully => " + id;
	};
	
	
	@PutMapping("/modified")
	public ResponseEntity<String> updateVendor(
			@RequestBody Vendor vendor
			){
		
		
		return ResponseEntity.ok("Updated! " + vendor); 
	}
	
}
