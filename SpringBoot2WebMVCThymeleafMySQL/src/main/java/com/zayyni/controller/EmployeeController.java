package com.zayyni.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zayyni.exception.EmployeeNotFoundException;
import com.zayyni.model.Employee;
import com.zayyni.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	private Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private IEmployeeService service; //HAS-A
	
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeReg";
	}
	
	@PostMapping("/save")
	public String saveEmp(
		@ModelAttribute Employee employee, Model model) 
	{
		log.info("Entered into save employee method");
		try {
			Integer eid = service.saveEmployee(employee);
			log.info("Employee Saved");
			String message = "Employee "+ eid+ "Saved";
			model.addAttribute("msg",message);
		}catch (Exception e) {
			log.error("Unable to process Save Employee {}",e.getMessage());
			e.printStackTrace();
		}
		log.info("About to return response for saved employee");
		return "EmployeeReg";
		
	}
	
	
	@GetMapping("/all")
	public String showAllEmps(Model model) {
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("list",list);
		return "EmpData";
	}
	
	@GetMapping("/delete")
	public String removeEmp(@RequestParam Integer eid,Model model) {
		log.info("Entered into Delete");
		try {
			service.deleteEmployee(eid);
			log.info("Delete Success full for emp");
			
		} catch (Exception e) {
			log.error("Employee Not deleted : {} ",e.getMessage());
			e.printStackTrace();
			throw e;
		}
		log.info("About to return response from delete emp");
		return "Empdelete";
	}
	
	
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer eid,Model model) {
		
		try {
			Employee emp = service.getOneEmployee(eid);
			model.addAttribute("employee",emp);
			
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return "EmployeeEdit";
	}
	
	
	@GetMapping("/edit")
	public String updateEmp(@ModelAttribute Employee employee)
	{
		service.updateEmployee(employee);
		return "redirect:all";
	}
	
	
	
	

}
