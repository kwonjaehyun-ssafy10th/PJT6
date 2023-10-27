package com.ssafy.video.model.service;

import com.ssafy.video.model.dto.User;

public interface UserService {

	int insert(User user);
	
	User searchById(String id);
	
}