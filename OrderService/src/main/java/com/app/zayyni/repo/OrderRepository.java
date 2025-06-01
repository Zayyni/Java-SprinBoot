package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.zayyni.dao.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
