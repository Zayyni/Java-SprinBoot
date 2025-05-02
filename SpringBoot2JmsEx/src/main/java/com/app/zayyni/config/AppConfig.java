package com.app.zayyni.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import jakarta.jms.ConnectionFactory;

@Configuration
public class AppConfig {
	
	@Bean
	public ConnectionFactory conn() {
		
		ActiveMQConnectionFactory am = new ActiveMQConnectionFactory();
		am.setBrokerURL("tcp://localhost:61616");
		am.setUserName("admin");
		am.setPassword("admin");
		return am;
	}

	@Bean
	public JmsTemplate jt() {
		return new JmsTemplate(conn());
	}
}
