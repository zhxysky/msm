package com.zhxy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {

	Logger logger = LoggerFactory.getLogger(IndexAction.class);
	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("hello......");
		logger.info("hello info.");
		return "hello";
	}
}
