package com.zayyni.Streaming;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
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
		
		/**
		 * Step=3 Create producer record and send to kafka broker
		 * */
		
		
		
		
		
		
		
		
		

	}

}
