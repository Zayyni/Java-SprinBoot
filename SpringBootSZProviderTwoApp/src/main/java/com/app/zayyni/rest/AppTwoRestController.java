package com.app.zayyni.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppTwoRestController {


	private Logger log = LoggerFactory.getLogger(AppTwoRestController.class);
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showB")
	public String showB() {
		log.info("WELCOME TO SERVICE # 2");
		
		String resp = rt.getForObject("http://localhost:8083/showC", String.class);
		log.info("BACK TO SERVICE # 2 {} ",resp);
		return "SERVICE#2";
	}
}
