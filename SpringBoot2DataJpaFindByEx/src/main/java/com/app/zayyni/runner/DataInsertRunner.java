package com.app.zayyni.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Product;
import com.app.zayyni.repository.ProductRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
	repo.saveAll(
			Arrays.asList(
			new Product(101,"S-TV",2500.0,"DELL","A"),
			new Product(102,"S-LAP",3500.0,"DELL","B"),
			new Product(103,"M-TV",2800.0,"NIM","A"),
			new Product(104,"M-LAP",4500.0,"NIM","C"),
			new Product(105,"C-TV",2500.0,"IBM","A"),
			new Product(106,"LG-LAP",3500.0,"IBM","B"),
			new Product(107,"LG-TV",2800.0,"LG","A"),
			new Product(108,"XI-LAP",4500.0,"LG","C")
			));

	}

}
