package com.tjxcgt.ly.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjxcgt.ly.entity.user;
import com.tjxcgt.ly.mapper.UserMapper;
import com.tjxcgt.ly.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	 @Autowired
	 private UserMapper userMapper;
	
	@Override
	public List<user> getUser(String test) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUser(test);
	}

}
