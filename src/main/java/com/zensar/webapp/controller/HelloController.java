package com.zensar.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "<h1>Welcome to Jenkins</h1>";
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		
		return "<h1>Welcome to Jenkins bysaying hI</h1>";
	}

}
