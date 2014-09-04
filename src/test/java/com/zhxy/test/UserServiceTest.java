package com.zhxy.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhxy.bean.User;
import com.zhxy.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:spring-mvc.xml"})
public class UserServiceTest {

	@Resource
	UserService userService;
	
	@Test
	public void testGetUserList() {
		List<User> userList = userService.getUserList();
		for(User user : userList) {
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void testGetUserById() {
		User user = userService.getUserById(3);
		System.out.println(user.toString());
	}
}
