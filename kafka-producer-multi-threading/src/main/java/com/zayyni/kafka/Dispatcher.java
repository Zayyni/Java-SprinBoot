package com.zayyni.kafka;

import java.io.File;
import java.util.Scanner;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import lombok.extern.slf4j.Slf4j;

public class Dispatcher implements Runnable {

	
	private final KafkaProducer<Integer, String> producer;
	private final String topicName;
	private final String dataFileLocation;
	
	public Dispatcher(KafkaProducer<Integer, String> producer,String topicName,String dataFileLocation) {
		
		this.producer = producer;
		this.topicName = topicName;
		this.dataFileLocation = dataFileLocation;
	}
	
	
	public void run() {
		
		System.out.println("Start processing the files from the location\t"+dataFileLocation);
		File file = new File(dataFileLocation);
		int count = 0;
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				String text = scan.nextLine();
				System.out.println("event count:\t"+count);
				ProducerRecord<Integer, String> record = new ProducerRecord<Integer, String>(topicName, count,text);
				producer.send(record);
				System.out.println("producer sent data to the topic:\t"+topicName);
				count ++;
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
