package com.zhxy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.bean.User;
import com.zhxy.service.UserService;

@Controller
public class IndexAction {

	Logger logger = LoggerFactory.getLogger(IndexAction.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello/{name}")
	public @ResponseBody String hello(@PathVariable String name) {
		System.out.println("hello "+name);
		logger.info("hello info.");
		System.out.println("br2..");
		System.out.println("br1..");
		System.out.println("br");
		System.out.println("rebase 1.");
		return "hello "+name;
	}
	
	
	@RequestMapping("/userList")
	public String userList(ModelMap model) {
		List<User> userList = userService.getUserList();
		userService.getUserById(1);
		model.addAttribute("userList", userList);
		model.addAttribute("msg", "success");
		return "userlist";
	}
	
	
	
}
