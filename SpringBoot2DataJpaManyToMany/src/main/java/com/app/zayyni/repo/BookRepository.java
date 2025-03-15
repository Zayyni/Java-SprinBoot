package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
