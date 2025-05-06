package com.app.zayyni.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	
	private Logger log = LoggerFactory.getLogger(ProducerService.class);
	
	@Value("${my.app.topicname}")
	private String topicName;
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	public void send(String message) {
		log.info("PRODUCER SENDING MESSAGE {} TO KAFKA !!!");
		template.send(topicName,message);
	}
	
	
}
