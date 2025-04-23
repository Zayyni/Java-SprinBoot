package com.app.zayyni.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.zayyni.model.Vendor;

@FeignClient("SpringCloudFCVendor")
public interface VendorRestConsumer {
	
	
	@GetMapping("/vendor/msg")
	public ResponseEntity<String> showMsg();
	
	@GetMapping("/vendor/obj")
	public ResponseEntity<Vendor> showMsgB();
	
	@GetMapping("/vendor/input/{id}")
	public ResponseEntity<String> showMsgC(@PathVariable("id") Integer id);

	@GetMapping("/vendor/list")
	public ResponseEntity<List<Vendor>> showMsgD();
}
