package com.codemonk96.service;

import com.codemonk96.model.User;

public interface UserService {
	
	public User register(User admin);
	
	public User login(String username, String password) throws Exception;
}
