package com.app.zayyni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudFcProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFcProductApplication.class, args);
	}

}
