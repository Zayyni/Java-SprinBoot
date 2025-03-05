package com.zayyni.kafka;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public class DispatcherDemo {

	public static void main(String[] args) {
		
		/**
		 * Step-1 = Load the kafka configuration
		 * */
		
		
		
		Properties props = new Properties();
		try {
			InputStream kafkaConfigFileStream = new FileInputStream(AppConfig.KAFKA_CONFIG_FILE_LOCATION);
			props.load(kafkaConfigFileStream);
			props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfig.APPLICATION_NAME);
			props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
			props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		/**
		 * Step-2 = Create kafka Producer object
		 * */
		
		KafkaProducer<Integer,String> producer = new KafkaProducer<Integer,String>(props);
		Thread[] dispatchers = new Thread[AppConfig.eventFiles.length];
		System.out.println("STARTING THE DISPATCHER THREADS.........");
		
		for (int i =0;i<AppConfig.eventFiles.length;i++) {
			String fileLocation = AppConfig.eventFiles[i];
			Dispatcher dispatcher = new Dispatcher(producer, AppConfig.TOPIC_NAME, fileLocation);
			dispatchers[i] =  new Thread(dispatcher);
			dispatchers[i].start();
		}
		
		try {
			
			for(Thread dispatcherThread:dispatchers) {
				dispatcherThread.join();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			producer.close();
		}
		
		
	}
}
