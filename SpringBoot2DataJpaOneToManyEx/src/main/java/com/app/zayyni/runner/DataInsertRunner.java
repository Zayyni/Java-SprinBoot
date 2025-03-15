package com.app.zayyni.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Contract;
import com.app.zayyni.model.Vendor;
import com.app.zayyni.repo.ContractRepository;
import com.app.zayyni.repo.VendorRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private VendorRepository vrepo;
	@Autowired
	private ContractRepository crepo;

	@Override
	public void run(String... args) throws Exception {
		
		Contract c1= new Contract(550,"C1",5000.0,"ROAD EXT");
		Contract c2= new Contract(551,"C2",6000.0,"WATER PIPLES");
		Contract c3= new Contract(552,"C3",7000.0,"CLEAN STREETS");
		
		
		Vendor v1 = new Vendor(8104,"SAM","HYD",Arrays.asList(c1,c2,c3));
		
//		crepo.save(c1);
//		crepo.save(c2);
//		crepo.save(c3);
		
		vrepo.save(v1);
		
		System.out.println("_____________DONE___________");

	}

}
