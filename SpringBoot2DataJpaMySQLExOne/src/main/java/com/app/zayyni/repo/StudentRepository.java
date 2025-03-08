package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.zayyni.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
