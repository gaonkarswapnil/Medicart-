package com.master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.dao.UserDao;
import com.master.dto.User;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}
	
	@Override
	public boolean findUser(User user) {
		return userDao.checkUser(user);
	}

	@Override
	public List<User> selectAll() {

		return userDao.findAll();
	}
	
}
