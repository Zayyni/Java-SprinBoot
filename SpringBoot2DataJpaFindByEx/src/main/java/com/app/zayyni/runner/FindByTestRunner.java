package com.app.zayyni.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Product;
import com.app.zayyni.repository.ProductRepository;

@Component
public class FindByTestRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
//	List<Product> list= repo.findByProdVendor("LG");
//	list.forEach(System.out::println);
//	List<Product> list= repo.findByProdGrade("A");
//	list.forEach(System.out::println);
	
//	repo.findByProdCostGreaterThanEqual(4000.0).forEach(System.out::println);
	
//	repo.findByProdCostLessThan(4000.0).forEach(System.out::println);
	
//	repo.findByProdGradeIsNull().forEach(System.out::println);
	
//	repo.findByProdGradeIsNotNull().forEach(System.out::println);
	
//	repo.findByProdNameLike("S%").forEach(System.out::println);
		
//	repo.findByProdNameLike("%TV").forEach(System.out::println);
		
//	repo.findByProdNameLike("____").forEach(System.out::println); //exact 4 chars
	
//	repo.findByProdNameLike("____%").forEach(System.out::println); // 4 or more chars
		
//	repo.findByProdNameNotLike("S%").forEach(System.out::println); // not starting with S
	
//	repo.findByProdNameStartingWith("S").forEach(System.out::println); // starting with S
	
//	repo.findByProdNameStartingWith("S").forEach(System.out::println); // starting with S
	
//	repo.findByProdNameEndingWith("P").forEach(System.out::println); // starting with P
		
	repo.findByProdNameContaining("A").forEach(System.out::println); // containing A
	

	}

}
