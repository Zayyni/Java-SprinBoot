package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Dept;

@Repository
public interface DeptRepository 
	extends JpaRepository<Dept, Integer> {

}
