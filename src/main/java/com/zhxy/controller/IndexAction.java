package com.zhxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {

	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("hello......");
		return "hello";
	}
}
