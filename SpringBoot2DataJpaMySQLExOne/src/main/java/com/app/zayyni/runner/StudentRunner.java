package com.app.zayyni.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.zayyni.model.Student;
import com.app.zayyni.repo.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*repo.save(new Student(10,"ACV","CORE",300.0));
		repo.save(new Student(11,"GTH","BOOT",600.0));
		repo.save(new Student(12,"CHE","MS",800.0));
		repo.save(new Student(13,"UIO","ADV",400.0));
		repo.save(new Student(14,"PIT","SQL",800.0));
		repo.save(new Student(15,"FOR","UI",400.0));
		repo.save(new Student(16,"CVA","CORE",200.0));
		repo.save(new Student(17,"THG","BOOT",900.0));
		repo.save(new Student(18,"HEC","MS",700.0));
		repo.save(new Student(19,"IOU","ADV",500.0));
		repo.save(new Student(20,"ITP","SQL",100.0));
		repo.save(new Student(21,"ORF","UI",600.0));
		*/

		System.out.println("------------------------------------");
//		Sort sort = Sort.by(Direction.ASC,"sname");
//		Sort sort = Sort.by(Direction.DESC,"sname");
//		repo.findAll(sort).forEach(System.out::println);
		
		
		//prepare pagination Input(number,size)
		
		Pageable input = PageRequest.of(1, 10,Sort.by(Direction.DESC,"sname"));
		Page<Student> page = repo.findAll(input);
		List<Student> list= page.getContent();
		list.forEach(System.out::println);
		
		// Additional info----
		
		System.out.println("Is Data exist in Page? "+ page.hasContent());
		System.out.println("Is First Page? "+ page.isFirst());
		System.out.println("Is Last Page? "+ page.isLast());
		System.out.println("Is Empty Page? "+page.isEmpty());
		System.out.println("Has Next Page? "+page.hasNext());
		System.out.println("Has Previous Page? "+page.hasPrevious());
		System.out.println("Current Page Number "+page.getNumber());
		System.out.println("Total Pages "+page.getTotalPages());
		System.out.println("Total Rows "+page.getTotalElements());
		

	}

}
