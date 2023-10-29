package com.ssafy.video.model.dao;

import com.ssafy.video.model.dto.User;

public interface UserDao {

	public User selectUser(User user);
	
	public void insertUser(User user);
	
}