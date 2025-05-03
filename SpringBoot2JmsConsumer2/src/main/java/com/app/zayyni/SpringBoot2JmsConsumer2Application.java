package com.app.zayyni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBoot2JmsConsumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JmsConsumer2Application.class, args);
	}

}
