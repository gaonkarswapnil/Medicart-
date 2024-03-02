package com.master.dao;

import java.util.List;

import com.master.dto.User;

public interface UserDao {
	
	void insertUser(User user);
	boolean checkUser(User user);
	
	public List<User> findAll();

}
