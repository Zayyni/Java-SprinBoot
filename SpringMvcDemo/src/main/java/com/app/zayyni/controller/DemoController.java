package com.app.zayyni.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class DemoController {
	
	
	@RequestMapping("/demo")
	public String greet() {
		return "Hello";
	};

}
