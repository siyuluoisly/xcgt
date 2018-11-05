package com.tjxcgt.ly.entity;

import org.springframework.stereotype.Component;

@Component
public class user {
	 private int user_id;
	 private String user_name;
	 private String full_name;
	 private String password;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", user_name=" + user_name + ", full_name=" + full_name + ", password="
				+ password + "]";
	}
	 
	 
}
