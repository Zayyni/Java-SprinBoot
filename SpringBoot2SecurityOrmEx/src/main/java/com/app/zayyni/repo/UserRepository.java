package com.app.zayyni.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.zayyni.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
	Optional<User> findByUserMail(String userMail);
}
