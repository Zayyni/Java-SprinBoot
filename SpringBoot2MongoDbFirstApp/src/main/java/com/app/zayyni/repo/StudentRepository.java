package com.app.zayyni.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.zayyni.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
