package com.app.zayyni.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
	
	@JmsListener(destination = "zayynitcp1")
	public void getMsg(String txt) {
		
		System.out.println("CONSUMER 2 DATA : " + txt);
	}

}
