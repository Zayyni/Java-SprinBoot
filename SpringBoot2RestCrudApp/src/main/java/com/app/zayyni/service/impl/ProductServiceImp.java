package com.app.zayyni.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.zayyni.model.Product;
import com.app.zayyni.repo.ProductRepository;
import com.app.zayyni.service.IProductService;

@Service
public class ProductServiceImp implements IProductService{
	
	@Autowired
	private ProductRepository repo;
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> list=repo.findAll();
		return list;
	}
	@Override
	public Integer saveProduct(Product p) {
		//JDK 10:  local variable type inference
		//Best dataType is selected by java complier
		var cost = p.getProdCost();
		var gst = cost*12.0/100;
		var disc = cost*20.0/100;
		p.setProdGst(gst);
		p.setProdDisc(disc);
		p = repo.save(p);
		return p.getProdId();
	}	

}
