package com.app.zayyni.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Student;
import com.app.zayyni.repo.StudentRepository;
@Component
public class StudentDataRunner implements CommandLineRunner{
	
	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		
		Student s1 = repo.save(new Student(101,"A",2.2));
		repo.save(new Student(102,"B",2.3));
		repo.save(new Student(103,"C",7.4));
		repo.save(new Student(104,"D",5.8));
		
		System.out.println("PrimaryKey => "+s1.getId());
		
		System.out.println("--------------------------------");
		
		repo.findAll().forEach(System.out::println);
		
		Student s = new Student();
		s.setCourses(List.of("DSA","DLL","SD"));
		s = repo.save(s);
		
		
		
	}

}
