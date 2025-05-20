package com.app.zayyni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.zayyni.exceptions.UserNotFoundException;
import com.app.zayyni.model.User;

@Service
public class UserService {
	
List<User> ul = new ArrayList<>();
	
	public UserService() {
		ul.add(new User(1,"ALI","Lhr","35784856"));
		ul.add(new User(2,"USMAN","Khr","254385"));
		ul.add(new User(3,"ZIA","Isl","98936893"));
		ul.add(new User(4,"ZOHAIB","Fsd","687368768"));
		ul.add(new User(5,"JOHN","Lhr","9389368936"));
		ul.add(new User(6,"MIKE","Lhr","9389368936"));
		ul.add(new User(7,"JOHN","Lhr","93287246"));
		ul.add(new User(8,"Jef","Fsd","875826"));
		ul.add(new User(9,"JOHN","Lhr","93287246"));
		ul.add(new User(10,"Jef","Fsd","875826"));
	}
	
	public List<User> getUsers(){
		return ul;
	}
	
	public User getUserById(int uid) {
		return ul.stream().filter(u->u.getUid()== uid)
				.findFirst()
				.orElseThrow(()->new UserNotFoundException("User not found with id "+ uid));
	}
	
	public User getUserbyName(String uname) {
		return ul.stream().filter(u->u.getUname().equalsIgnoreCase(uname))
				.findFirst()
				.orElseThrow(()->new UserNotFoundException("User not found with name "+ uname));
	}
	
	public User insertUser(User usr) {
		ul.add(usr);
		return this.getUserById(usr.getUid());
	
	}
	
	public User updateUser(int uid, User usr) {
		User existing = this.getUserById(uid);
		
		if(usr.getUname()!=null) {
			existing.setUname(usr.getUname());
		}
		if(usr.getAddr()!=null) {
			existing.setAddr (usr.getAddr());
		}
		return existing;
		
	}
	
	public String deleteUser(int uid) {
		User existing = this.getUserById(uid);
		ul.remove(existing);
		
		return "User deleted with Id: "+uid;
		
	}

}
