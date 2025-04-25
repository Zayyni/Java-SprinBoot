package com.app.zayyni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudCsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCsConfigServerApplication.class, args);
	}

}
