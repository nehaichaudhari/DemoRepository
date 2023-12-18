package com.files;

import java.io.Serializable;

public class User implements Serializable {
	private int userId;
	private String uname;
	private transient String password;

	User() {

	}

	public User(int userId, String uname, String password) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", uname=" + uname + ", password=" + password + " ]";
	}
}
