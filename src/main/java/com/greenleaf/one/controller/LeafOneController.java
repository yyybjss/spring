package com.greenleaf.one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LeafOneController {

	@RequestMapping("/sayhello")
	String SayHello() {
		return "hello springboot";
	}
	
	@RequestMapping("/showdata")
	String ShowData() {
		return "this is data";
	}
	
}
