package com.app.zayyni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAppController {

	
	@GetMapping("/home")
	public String showHome() {
		return "HOMEPAGE";
	}
	
	@GetMapping("/emp")
	public String showEmp() {
		return "EmpPage";
	}
	
	@GetMapping("/adm")
	public String showAdmin() {
		return "AdminPage";
	}
	
	@GetMapping("/common")
	public String showCommon() {
		return "CommonPage";
	}
	
	@GetMapping("/denied")
	public String showDenied() {
		return "DeniedPage";
	}
}
