package com.app.zayyni;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties("my.app")
@Component
@Data
@NoArgsConstructor
public class EmailConfig {
	
	private String host;
	private int port;
	private String username;
	private String password;
	

}
