package com.jd.service;

import org.springframework.stereotype.Service;

@Service
public class UserError implements UserService {


	@Override
	public String user(String name) {
		return "用户系统出错"+name+"!  sorry ,error !";
	}
	

}
