package com.app.zayyni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBoot2JmsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JmsConsumerApplication.class, args);
	}

}
