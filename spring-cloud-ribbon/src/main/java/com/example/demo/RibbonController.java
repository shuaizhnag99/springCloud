package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String getHello(String name) {
		String result=restTemplate.getForObject("http://spring-cloud-provider/server/hello?name="+name, String.class);
		return result;
	}

}
