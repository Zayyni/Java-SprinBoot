package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Person;
import com.app.zayyni.model.Profile;
import com.app.zayyni.repo.PersonRepository;
import com.app.zayyni.repo.ProfileRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private PersonRepository peRepo;
	@Autowired
	private ProfileRepository prRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Profile p1 = new Profile(50,"P1","CNIC","AABB55001","LHR");
		Profile p2 = new Profile(51,"P2","DL","LOBB556801","KHR");
		Profile p3 = new Profile(52,"P3","SR","PI57855001","LHR");

		prRepo.save(p1);
		prRepo.save(p2);
		prRepo.save(p3);
		
		Person pe1 = new Person(1501,"S","A","786687-257","MALE",p1);
		Person pe2 = new Person(1502,"H","B","892568-257","MALE",p2);
		Person pe3 = new Person(1503,"K","C","356666-257","FEMALE",p3);
		
		peRepo.save(pe1);
		peRepo.save(pe2);
		peRepo.save(pe3);
		
		System.out.println("_____________DONE_____________");
		
	}

}
