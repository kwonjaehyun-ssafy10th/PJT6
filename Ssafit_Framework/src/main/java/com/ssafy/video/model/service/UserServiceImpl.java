package com.ssafy.video.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.video.model.dao.UserDao;
import com.ssafy.video.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	public void setUserRepo(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserRepo() {
		return this.userDao;
	}

	@Override
	@Transactional
	public int insert(User user) {
		/*
		 * // 사용자 정보를 등록한다. userDao.insert(user); // 고의로 예외를 발생시키는 코드를 삽입한다. // 트랜잭션 처리가
		 * 되면 에외 발생시 롤백된다. // 트랜잭션 처리가 되지 않으면 그대로 DB에 반영된다. int err = 1/0;
		 */
		return userDao.insert(user);
	}

	@Override
	public User searchById(String id) {
		return userDao.searchById(id);
	}

}