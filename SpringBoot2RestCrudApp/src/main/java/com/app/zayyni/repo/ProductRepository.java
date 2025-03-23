package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.zayyni.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
