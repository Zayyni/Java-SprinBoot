package com.app.zayyni.runner;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Customer;
import com.app.zayyni.model.Product;
import com.app.zayyni.model.Vendor;
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
		
		
		p.setColors(List.of("RED","BLUE","GREEN"));
		p.setMcodes(
				Map.of(
						"CB50",50,
						"ES25",25,
						"CS12",12
						)
				);
		
		p.setVob(new Vendor("ZAYYNI","CONTRACT","LHR"));
		
		p.setCobs(
				List.of(
						new Customer(444,"AB","+99-454358-45"),
						new Customer(555,"CD","+99-365448-45"),
						new Customer(666,"EF","+99-3635868-45")
						)
				);
		
		p = repo.save(p);
		System.out.println("SAVED WITH ID " + p.getId());

	}

}
