package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.remote.HelloRemoteInterface;

@RestController
public class HelloWordController {
	@Autowired
	private HelloRemoteInterface helloRemoteInterface;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(@RequestParam String name) {
		return helloRemoteInterface.testHello(name);
	}

}
