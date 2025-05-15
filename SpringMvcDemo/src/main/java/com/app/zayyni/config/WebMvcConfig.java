package com.app.zayyni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebMvcConfig {
	
	@Bean
	public InternalResourceViewResolver initresolver() {
		InternalResourceViewResolver ir= new InternalResourceViewResolver();
		ir.setPrefix("/");
		ir.setPrefix(".html");
		
		return ir;
	}

}
