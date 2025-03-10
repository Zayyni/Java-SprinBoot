package com.app.zayyni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	//***********************************2 like operator**************************//
	
	List<Product>findByProdNameLike(String prodName);
	
	
	List<Product>findByProdNameNotLike(String prodName);
	
	
	List<Product>findByProdNameStartingWith(String prodName);
	
	List<Product>findByProdNameEndingWith(String prodName);
	
	List<Product>findByProdNameContaining(String prodName);
	
	//----------------------------1---------------------------------------//
	
	
	// RT findBy<VariableName> (<DataType> <paramName>);
	// SQL: select * from product where prod_Vender=?
	List<Product> findByProdVendor(String prodVendor);
	//SQL: select * from product where prod_Grade=?
	List<Product> findByProdGrade(String prodGrade);
	
	//SQL: select * from product where prod_Cost>=?
	List<Product> findByProdCostGreaterThanEqual(Double prodCost);
	
	//SQL: select * from product where prod_Cost<?
	List<Product> findByProdCostLessThan(Double prodCost);
	
	//SQL: select * from product where prod_Grade is null
	List<Product> findByProdGradeIsNull();
	
	//SQL: select * from product where prod_Grade is not null
	List<Product> findByProdGradeIsNotNull();
	
	
	
	
	
	

}
