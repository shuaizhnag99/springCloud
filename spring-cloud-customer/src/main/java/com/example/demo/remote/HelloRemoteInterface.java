package com.example.demo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-cloud-provider" ,path="/server")
public interface HelloRemoteInterface {
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    String testHello(@RequestParam(value = "name") String name);
}
