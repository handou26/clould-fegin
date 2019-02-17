package com.jd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value="orderService",fallback=OrderError.class)
public interface OrderService {
	
	 @RequestMapping(value = "/order", method = RequestMethod.GET)
     public String order(@RequestParam("name") String name);
	 
	 
	 @RequestMapping(value = "/setsession", method = RequestMethod.GET)
     public String setsession(@RequestParam("name") String name);

}
