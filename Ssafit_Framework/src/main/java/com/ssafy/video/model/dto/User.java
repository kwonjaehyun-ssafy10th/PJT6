package com.ssafy.video.model.dto;

public class User {
	private String id;
	private String password;
	
	public User() {
		super();
	}
	
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + id + ", password=" + password + "]";
	}

}
