package com.ssafy.video.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.video.model.dao.UserDao;
import com.ssafy.video.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao dao;
	
	@Override
	public User login(User user) {
		return dao.selectUser(user);
	}

	@Override
	public void signup(User user) {
		dao.insertUser(user);
	}

}
