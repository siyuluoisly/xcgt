package com.tjxcgt.ly.service;

import java.util.List;

import com.tjxcgt.ly.entity.user;

public interface UserService {
	//获取用户名单
    public List<user> getUser() throws Exception;
}
