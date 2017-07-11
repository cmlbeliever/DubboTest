package com.cml.dubbo.server.annotation.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cml.dubbo.server.annotation.UserService;

@Service()
public class UserServiceImpl implements UserService {

	@Override
	public String login(String username, String password) {
		return username + ":" + password;
	}

}
