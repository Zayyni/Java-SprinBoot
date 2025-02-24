package com.app.zayyni.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExportData {
	
//	@Scheduled(fixedRate = 2000) // 2sec = 200 mill
	@Scheduled(cron = "0 0 9/3 1 * *")
	public void execute() {
		System.out.println("DONE "+ new Date());
	}

}
