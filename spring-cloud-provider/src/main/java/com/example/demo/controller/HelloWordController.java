package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	
	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return "hello "+name +" this is spring cloud server provider";
	}

}
