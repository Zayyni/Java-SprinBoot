package com.app.zayyni.producer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import com.app.zayyni.events.MovieTicketEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MovieTicketsProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value("${movie.tickets.topic}")
	private String topicName;
	
	@Value("${movie.tickets.partitions}")
	private int partitions;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	public Boolean isValidateTicket(MovieTicketEvent ticketEvent) {
		//invoke the QR-CODE generator API to validate the ticket
		
		return true;
	}
	
	/**
	 * only valid/verified movie tickets will send to topic 
	 * @param ticketEvent
	 * @throws JsonProcessingException 
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public void sendTicketEvents(MovieTicketEvent ticketEvent) throws JsonProcessingException, InterruptedException, ExecutionException {
		
		String key = ticketEvent.getTicketNumber();
		String data = objectMapper.writeValueAsString(ticketEvent);
		System.out.println("topic name is:\t"+topicName);
		CompletableFuture<SendResult<String, String>> future =  kafkaTemplate.send(topicName,key, data);
		try {
			if(future.isDone()) {
				System.out.println("Producer Produced the Data");
				System.out.println("Please collect the ack");
				SendResult<String, String> result = future.get();
				try {
					RecordMetadata recordMetadata= result.getRecordMetadata();
					System.out.println("has time stamp:\t"+recordMetadata.hasTimestamp());
					System.out.println("transmitted has value size:\t"+recordMetadata.serializedValueSize());
					System.out.println("message transmitted partition:\t"+recordMetadata.partition());
					System.out.println("message transmitted to topic:\t"+recordMetadata.topic());
//					String recordData = objectMapper.writeValueAsString(result.getProducerRecord());
//					System.out.println("event sent sucessfully and the event data is:\t");
					String recordMeta = objectMapper.writeValueAsString(recordMetadata);
					System.out.println(recordMeta);
				} catch (JsonProcessingException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			
		} catch (Exception e) {
			throw new RuntimeException(e.getLocalizedMessage());
		}
		
	}}	
