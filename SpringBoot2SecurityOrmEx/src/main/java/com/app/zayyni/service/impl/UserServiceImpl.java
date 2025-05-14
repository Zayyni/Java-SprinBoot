package com.app.zayyni.service.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.zayyni.model.User;
import com.app.zayyni.repo.UserRepository;
import com.app.zayyni.service.IUserService;

@Service
public class UserServiceImpl implements IUserService,UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getUserId();
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    // Fetch user from database using email
	    Optional<User> opt = repo.findByUserMail(username);
	    
	    if (opt.isEmpty()) {
	        // If user is not found, throw exception
	        throw new UsernameNotFoundException("User not found with email: " + username);
	    } else {
	        User user = opt.get();
	        
	        // Convert user's roles or authorities into GrantedAuthority list
	        Set<GrantedAuthority> authorities = new HashSet<>();
	        Set<String> roles = user.getUserRoles();
	        for(String role:roles) {
	        	authorities.add(new SimpleGrantedAuthority(role));
	        }

	        // Return Spring Security User object
	        return new org.springframework.security.core.userdetails.User(
	                user.getUserMail(),
	                user.getUserPwd(),
	                authorities
	        );
	    }
	}

}
