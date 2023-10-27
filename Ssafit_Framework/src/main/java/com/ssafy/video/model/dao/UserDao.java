package com.ssafy.video.model.dao;

import com.ssafy.video.model.dto.User;

public interface UserDao {

	User searchById(String id);
	
	int insert(User user);
	
}