package com.app.zayyni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBoot2AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2AdminServerApplication.class, args);
	}

}
