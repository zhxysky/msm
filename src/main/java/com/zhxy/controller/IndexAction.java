package com.zhxy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhxy.bean.User;
import com.zhxy.service.UserService;

@Controller
public class IndexAction {

	Logger logger = LoggerFactory.getLogger(IndexAction.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("hello......");
		logger.info("hello info.");
		return "hello";
	}
	
	
	@RequestMapping("/userList.do")
	public String userList(ModelMap model) {
		List<User> userList = userService.getUserList();
		userService.getUserById(1);
		model.addAttribute("userList", userList);
		model.addAttribute("msg", "success");
		System.out.println("123");
		return "userlist";
	}
	
	
	
}
