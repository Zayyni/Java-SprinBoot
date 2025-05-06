package com.app.zayyni.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.zayyni.service.ProducerService;
import com.app.zayyni.store.MessageStore;

@RestController
@RequestMapping("/kafka")
public class MyKafkaRestController {
	
	private Logger log = LoggerFactory.getLogger(MyKafkaRestController.class);
	
	@Autowired
	private ProducerService producer;
	
	
	@Autowired
	private MessageStore store;
	
	//1. read msg from the source and send
	
	@GetMapping("/send")
	public String send(
			@RequestParam("msg") String message
			) {
		log.info("MESSAGE AT CONTROLLER : {} ",message);
		producer.send(message);
		return "SENT" + message;
	}
	
	
	
	//2. display all messages from store
	@GetMapping("/all")
	public String viewAllMsgs() {
		return store.getAll();
	}
	

}
