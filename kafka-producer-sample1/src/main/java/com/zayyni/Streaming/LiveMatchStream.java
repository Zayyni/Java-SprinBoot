package com.zayyni.Streaming;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public class LiveMatchStream {

	public static void main(String[] args) {
		System.out.println("Creating Kafka Produer Configuration");
		System.out.println("=====================================");
		
		/**
		 * Step=1 Create producer configurations
		 * */
		
		Properties props = new Properties();
		props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfig.APPLICATION_ID);
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfig.BOOTSTRAP_SERVERS);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		
		/**
		 * Step=2 Create kafka producer
		 * */
		
		
		KafkaProducer<Integer, String> liveMatchStream = new KafkaProducer<Integer,String>(props);
		System.out.println("Kafka Produer Created");
		
		/**
		 * Step=3 Create producer record and send to kafka broker
		 * */
		
		System.out.println("Sending 1 million records");
		long startTime = System.currentTimeMillis();
		
		for (int i=1; i<=AppConfig.NUM_EVENTS;i++) {
			String message = "Match Replay"+ i ;
			ProducerRecord<Integer, String> stream = new ProducerRecord<Integer, String>(AppConfig.TOPIC_NAME,i,message);
			liveMatchStream.send(stream);
		}
		System.out.println("1 million records sent");
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time taken to send "+AppConfig.NUM_EVENTS + "are:\t" + (endTime-startTime)+ " in mills");
		
		/**
		 * Step=4 Close the producer session
		 * */
		liveMatchStream.close();
		System.out.println("Produer is Closed");
		
		
		
		
		

	}

}
