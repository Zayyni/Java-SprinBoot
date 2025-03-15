package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {

}
