package com.app.zayyni.cosumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BranchRestConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String getBranchInfo() {
		//1. Get SI details from Eureka using ServiceId
		
		ServiceInstance si =client.choose("SpringCloudLBCBranchService");
		
		//2. read URI and Add Path
		URI uri=si.getUri();
		String url = uri+"/branch/info";
		
		
		//3. Make HTTP call
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> resp=rt.getForEntity(url, String.class);
		
		//4. Return response body
		return resp.getBody();
		
	}

}
