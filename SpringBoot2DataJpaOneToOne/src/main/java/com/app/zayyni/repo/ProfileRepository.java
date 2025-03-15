package com.app.zayyni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
