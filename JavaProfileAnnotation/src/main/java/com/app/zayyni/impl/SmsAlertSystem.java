package com.app.zayyni.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.zayyni.service.AlertSystem;

import lombok.Data;

@Component
@Profile("sms")
@ConfigurationProperties(prefix = "my.app")
@Data
public class SmsAlertSystem implements AlertSystem{
	
	private String service;
	private String fmt;
	
	@Override
	public void sendMessage() {
		System.out.println("FROM SMS SYSTEM "+ service +"-" + fmt );
	}

}
