package com.master.service;

import java.util.List;

import com.master.dto.User;

public interface UserService {
	void addUser(User user);
	boolean findUser(User user);
	
	public List<User> selectAll();
	
}
