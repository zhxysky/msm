package com.zhxy.dao;

import java.util.List;

import com.zhxy.bean.User;

public interface UserDao {

	List<User> getUserList();

	User getUserById(int userId);
}
