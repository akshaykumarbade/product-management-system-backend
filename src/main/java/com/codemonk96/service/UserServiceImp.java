package com.codemonk96.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemonk96.model.User;
import com.codemonk96.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired UserRepository userRepo;
	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		System.out.println("in register method...");
		
		return userRepo.save(user);
	}

	@Override
	public User login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in login method");
		
		User a = userRepo.findByUsernameAndPassword(username, password);
		
		if(a == null) {
			throw new Exception("User Not Found");
		}
		
		return a ;
	}

}
