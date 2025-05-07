package com.app.zayyni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {

	
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}

	/*
	 * It indicates collecting traceDetails from Sleuth by Zipkin Client , sent to UI
	 * */
	@Bean
	public Sampler samplerObj() {
		return Sampler.ALWAYS_SAMPLE;
//		return Sampler.NEVER_SAMPLE;
	}
}
