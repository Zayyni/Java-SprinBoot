package com.app.zayyni.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppThreeRestController {
	

	private Logger log = LoggerFactory.getLogger(AppThreeRestController.class);
	
	@GetMapping("/showC")
	public String showC() {
		log.info("WELCOME TO SERVICE # 3");
		
		log.info("BACK TO SERVICE # 3 ");
		return "SERVICE#3";
	}

}
