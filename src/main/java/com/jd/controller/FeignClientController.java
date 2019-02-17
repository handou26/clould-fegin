package com.jd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jd.service.OrderService;
import com.jd.service.UserService;

@RestController
public class FeignClientController {
	
	@Autowired
	private OrderService orderService;	
	
	
	@Autowired
	private UserService userService;	
	
	
	@RequestMapping("feign-order")
    public String order(String name){
    	
    	return orderService.order(name);
    }
	
	
	@RequestMapping("feign-user")
    public String user(String name){
    	
    	return userService.user(name);
    }
	
	@RequestMapping("feign-order-user")
    public String orderuser(String name){
    	
    	return orderService.order(name)+userService.user(name);
    }
	
	@RequestMapping("feign-session")
    public String session(String name){
    	
    	return orderService.setsession(name);
    }
}
