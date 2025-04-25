package com.app.zayyni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudCsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCsEurekaApplication.class, args);
	}

}
