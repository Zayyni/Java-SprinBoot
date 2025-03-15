package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
