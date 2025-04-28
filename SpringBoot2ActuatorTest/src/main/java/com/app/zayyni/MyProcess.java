package com.app.zayyni;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyProcess {
	
	
	@Scheduled(cron = "0 0 9 * * *")
	public void printReport() {
		System.out.println("DONE");
	}

}
