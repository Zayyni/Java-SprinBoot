package com.app.zayyni;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class Test {
	
	public static void main(String[] args) {
		String pwd = "ZYA";
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encPwd = encoder.encode(pwd);
		System.out.println(encPwd);
	}

}
