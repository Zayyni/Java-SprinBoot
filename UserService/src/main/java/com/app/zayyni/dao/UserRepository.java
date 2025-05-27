package com.app.zayyni.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.zayyni.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
