package com.app.zayyni.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Author;
import com.app.zayyni.model.Book;
import com.app.zayyni.repo.AuthorRepository;
import com.app.zayyni.repo.BookRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private AuthorRepository arepo;
	@Autowired
	private BookRepository brepo;

	@Override
	public void run(String... args) throws Exception {
		
		Author a1= new Author(60,"SAM","HYD");
		Author a2= new Author(61,"SLA","LAH");
		Author a3= new Author(62,"MLA","KAR");
		Author a4= new Author(63,"DAL","STY");
		Author a5= new Author(64,"YU","HYD");
		
		arepo.save(a1);
		arepo.save(a2);
		arepo.save(a3);
		arepo.save(a4);
		arepo.save(a5);
		
		Book b1 = new Book(98001,"CORE JAVA","PRGM", Arrays.asList(a2,a3));
		Book b2 = new Book(98002,"DESIGN PATTERN","THERY", Arrays.asList(a1,a4,a5));
		Book b3 = new Book(98003,"MATHS","CORE TYPE", Arrays.asList(a1,a2));
		
		brepo.save(b1);
		brepo.save(b2);
		brepo.save(b3);

	}

}
