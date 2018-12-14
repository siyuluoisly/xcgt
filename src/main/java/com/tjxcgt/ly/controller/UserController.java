package com.tjxcgt.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tjxcgt.ly.entity.user;
import com.tjxcgt.ly.service.UserService;

@RestController
@RequestMapping("/list")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	//显示用户
    @RequestMapping("/user")
    public List<user> index() throws Exception {
        return userService.getUser();
    }
}
