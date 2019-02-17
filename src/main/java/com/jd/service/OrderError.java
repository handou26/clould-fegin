package com.jd.service;

import org.springframework.stereotype.Service;

@Service
public class OrderError implements OrderService {

	@Override
	public String order(String name) {
		return "订单系统出错"+name+"!  sorry ,error !";
	}

	@Override
	public String setsession(String name) {
		return "session出错"+name+"!  sorry ,error !";
	}
	

}
