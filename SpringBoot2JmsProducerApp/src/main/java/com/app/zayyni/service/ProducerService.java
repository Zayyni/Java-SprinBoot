package com.app.zayyni.service;

import java.io.FileInputStream;

import org.apache.activemq.command.MessageAck;
import org.fusesource.hawtbuf.codec.BytesCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.app.zayyni.util.DataUtil;

import jakarta.jms.Destination;
import jakarta.jms.TextMessage;

@Component
public class ProducerService implements CommandLineRunner{
	
	@Autowired
	private JmsTemplate jt;

	public void run(String... args) throws Exception {
		

		/*
		String destinationName = "myq1";
		MessageCreator messageCreator = (session) -> {
			TextMessage tm =session.createTextMessage("FIRST JMS APP");
			return tm;
		};
		jt.send(destinationName , messageCreator);
		
		*/
		String[] arr = DataUtil.getData();
		
		for(String msg:arr) {
			Thread.sleep(5000);
			jt.send("zayynitcp1",ses->ses.createTextMessage(msg));
			
			System.out.println("MESSAGE SENT TO MOM !!!");
			
		}

	}
}
