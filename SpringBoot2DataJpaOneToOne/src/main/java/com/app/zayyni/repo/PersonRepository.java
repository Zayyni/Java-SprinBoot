package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
