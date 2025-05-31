package com.app.zayyni.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	
	Optional<User> findByUname(String Uname);
	
	Optional<List<User>> findByAddr(String addr);
	
	@Query(value = "Select * from user where uname=:uname and addr=:addr ",nativeQuery = true)
	public User findUserAddrAndUname(String uname,String addr);

}
