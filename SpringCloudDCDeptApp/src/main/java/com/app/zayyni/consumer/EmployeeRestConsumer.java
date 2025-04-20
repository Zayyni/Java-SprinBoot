package com.app.zayyni.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmployeeRestConsumer {
	
	//1. Autowire Discovery Client

	@Autowired
	private DiscoveryClient client;
	
	public String getEmpData() {
		
		//2. Fetch List<SI> using Producer ServiceId
		List<ServiceInstance> list = client.getInstances("SpringCloudDCEmpApp");
		
		//3. Read one instance from index#0
		ServiceInstance si = list.get(0);
		
		//4. Read URI from SI
		URI uri =si.getUri();
		
		//5. Create URL
		String url = uri + "/emp/show";
		
		//6. Use RestTemplate class obj
		RestTemplate rt = new RestTemplate();
		
		//7. Make HTTP call
		ResponseEntity<String> resp=rt.getForEntity(url, String.class);
		
		//8. Read Response Body
		String respBody = resp.getBody();
		
		//9. return Back to consumer's RestController
		return respBody;
	}
}
