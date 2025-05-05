package com.app.zayyni.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.zayyni.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
