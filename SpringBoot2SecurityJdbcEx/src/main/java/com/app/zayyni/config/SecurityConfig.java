package com.app.zayyni.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityConfig extends WebSecurityConfiguration{

	@Autowired
	private DataSource datasource;

	protected void configure (AuthenticationManagerBuilder auth) throws Exception{
		auth.jdbcAuthentication()
		.passwordEncoder(new BCryptPasswordEncoder())
		.dataSource(datasource)
		.usersByUsernameQuery("SELECT UNAME, UPWD, UENABLED FROM USERTAB WHERE UNAME = ?")
		.authoritiesByUsernameQuery("SELECT UNAME, UROLE FROM USERTAB WHERE UNAME = ?")
		;
	}
	

}
