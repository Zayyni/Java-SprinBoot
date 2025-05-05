package com.app.zayyni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Product;
import com.app.zayyni.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		//remove if old data exists
		//compare with ddl-create
		repo.deleteAll();
		Product p = new Product();
		p.setPid(100);
		p.setPcode("ABC");
		p.setPcost(300.25);
		
		p = repo.save(p);
		System.out.println("SAVED WITH ID " + p.getId());

	}

}
