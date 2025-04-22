package com.app.zayyni.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SpringCloudFCVendor")
public interface VendorRestConsumer {
	
	
	@GetMapping("/vendor/msg")
	public ResponseEntity<String> showMsg();

}
