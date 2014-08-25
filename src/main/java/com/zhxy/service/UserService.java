package com.zhxy.service;

import java.util.List;

import com.zhxy.bean.User;

public interface UserService {

	List<User> getUserList();
	
	public User getUserById(int userId);
	
}
