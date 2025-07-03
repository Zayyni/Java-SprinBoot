package com.app.zayyni.service;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.zayyni.dao.UserRepository;
import com.app.zayyni.exceptions.UserNotFoundException;
import com.app.zayyni.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	DataSource ds;
	
//	initmysql(){
//		ds.createConnectionBuilder().build();
//	}
	
//List<User> ul = new ArrayList<>();
	
//	public UserService() {
//		ul.add(new User(1,"ALI","Lhr","35784856"));
//		ul.add(new User(2,"USMAN","Khr","254385"));
//		ul.add(new User(3,"ZIA","Isl","98936893"));
//		ul.add(new User(4,"ZOHAIB","Fsd","687368768"));
//		ul.add(new User(5,"JOHN","Lhr","9389368936"));
//		ul.add(new User(6,"MIKE","Lhr","9389368936"));
//		ul.add(new User(7,"JOHN","Lhr","93287246"));
//		ul.add(new User(8,"Jef","Fsd","875826"));
//		ul.add(new User(9,"JOHN","Lhr","93287246"));
//		ul.add(new User(10,"Jef","Fsd","875826"));
//	}
	
	public List<User> getUsers(){
//		return ul;
		return (List<User>) repo.findAll();
	}
	
	public List<User> getUserByPage(int pageNo,int pageSize){
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		
		Page<User> page = repo.findAll(pageable);
		
		if(page.getContent().isEmpty()) {
			throw new RuntimeException("No Records found for this page");
		}
		return page.toList();
	};
	
	public List<User> getUserBySort(String sort, String asc){
		if(asc.equalsIgnoreCase("dsc")) {
			return repo.findAll(Sort.by(sort).descending());
		}
		return repo.findAll(Sort.by(sort).ascending());
	};
	
	public User getUserById(int uid) {
//		return ul.stream().filter(u->u.getUid()== uid)
//				.findFirst()
//				.orElseThrow(()->new UserNotFoundException("User not found with id "+ uid));
		return repo.findById(uid).orElseThrow(()->new UserNotFoundException("User not found with id "+ uid));
	}
	
	public User getUserbyName(String uname) {
		return repo.findByUname(uname)
				.orElseThrow(()->new UserNotFoundException("User not found with name "+ uname));
	}
	
	public List<User> getUserbyAddr(String addr) {
		return repo.findByAddr(addr)
				.orElseThrow(()->new UserNotFoundException("Address not found with "+ addr));
	}
	
	public User insertUser(User usr) {
//		ul.add(usr);
//		return this.getUserById(usr.getUid());
		return repo.save(usr);
	
	}
	
	public User getUnameAndAddr(String uname,String addr) {
		return repo.findUserAddrAndUname(uname,addr);
	}
	
	public User updateUser(int uid, User usr) {
		User existing = this.getUserById(uid);
		
		if(usr.getUname()!=null) {
			existing.setUname(usr.getUname());
		}
		if(usr.getAddr()!=null) {
			existing.setAddr (usr.getAddr());
		}
		return repo.save(existing);
		
	}
	
	public String deleteUser(int uid) {
//		User existing = this.getUserById(uid);
//		ul.remove(existing);
		
		repo.deleteById(uid);
		
		return "User deleted with Id: "+uid;
		
	}

}
