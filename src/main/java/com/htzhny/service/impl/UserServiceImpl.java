package com.htzhny.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fresh.service.UserService;
import com.htzhny.dao.UserDao;
import com.htzhny.entity.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	private UserDao userdao;
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userdao.findByUserId(user.getUserId());
	}

}
