package com.app.zayyni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import jakarta.jms.Destination;
import jakarta.jms.TextMessage;

@Component
public class ProducerService implements CommandLineRunner{
	
	@Autowired
	private JmsTemplate jt;

	public void run(String... args) throws Exception {
		

		String destinationName = "myq1";
		MessageCreator messageCreator = (session) -> {
			TextMessage tm =session.createTextMessage("FIRST JMS APP");
			return tm;
		};
		jt.send(destinationName , messageCreator);
		System.out.println("DONE!!!");
	}
}
