package com.app.zayyni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.zayyni.model.User;
import com.app.zayyni.repo.UserRepository;
import com.app.zayyni.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;
	
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getUserId();
	}

}
