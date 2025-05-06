package com.app.zayyni.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.app.zayyni.store.MessageStore;

@Component
public class ConsumerService {
	
	private Logger log = LoggerFactory.getLogger(ConsumerService.class);
	@Autowired
	public MessageStore ms;
	
	
	@KafkaListener(
			topics = "${my.app.topicname}",
			groupId = "groupId")
	public void addToStore(String message) {
		log.info("CONSUMER IS READING MESSAGE FROM KAFKA {} ",message);
		ms.add(message);
	}

}
