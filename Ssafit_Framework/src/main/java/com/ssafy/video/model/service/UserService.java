package com.ssafy.video.model.service;

import com.ssafy.video.model.dto.User;

public interface UserService {
	
	User login(User user);
	
	void signup(User user);
	
}