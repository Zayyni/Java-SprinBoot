package com.app.zayyni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.zayyni.model.User;
import com.app.zayyni.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	//1. To display User Register page
	@GetMapping("/register")
	public String showRegister() {
		return "UserRegister";
	}
	
	//2. On click submit button read form data
	
	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute User user,
			Model model
			) {
		Integer id = service.saveUser(user);
		String msg = //"User'"+id+"' saved!!";
				new StringBuffer()
				.append("User '")
				.append(id)
				.append("'(")
				.append(user.getUserName())
				.append(") saved!").toString();
		model.addAttribute("message",msg);
		return "UserRegister"; // Correct spelling

	}
	
	

}
