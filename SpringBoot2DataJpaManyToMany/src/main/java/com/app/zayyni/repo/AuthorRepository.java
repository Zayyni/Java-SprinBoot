package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
