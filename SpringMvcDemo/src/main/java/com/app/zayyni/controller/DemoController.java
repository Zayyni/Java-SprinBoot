package com.app.zayyni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	
	@RequestMapping("/demo")
	public String greet() {
		return "hello";
	};
	
	@RequestMapping(value = {"/home","/"})
	public String home() {
		return "home";
	};

}
