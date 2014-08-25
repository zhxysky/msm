package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.bean.User;
import com.zhxy.dao.UserDao;
import com.zhxy.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}
	@Override
	public User getUserById(int userId) {
		System.out.println("get user by id."+userId);
		return null;
	}

}
