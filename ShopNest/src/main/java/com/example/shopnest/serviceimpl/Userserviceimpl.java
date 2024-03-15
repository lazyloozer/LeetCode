package com.example.shopnest.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopnest.entity.User;
import com.example.shopnest.respositiory.UserRepository;
import com.example.shopnest.service.UserService;
@Service
public class Userserviceimpl implements UserService {
	
	@Autowired
	UserRepository UserRepository;

	public void addUser(User user) {
		UserRepository.save(user);
		
		// TODO Auto-generated method stub
		
	}

	public boolean vaildateUser(String email, String password) {
	if(	UserRepository.findByEmail(email)!=null) {
		
		User user=UserRepository.findByEmail(email);
		
		String dbpwd = user.getPassword();
		if(password.equals(dbpwd)) {
		return true;
		
	}else {
		return false;
	}
		// TODO Auto-generated method stub
	}
	return false;
	}

	public String getRole(String email) {
		User user = UserRepository.findByEmail(email);
		
		return user.getRole();
		// TODO Auto-generated method stub
		
	}

	public boolean emailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}
