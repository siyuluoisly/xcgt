package com.tjxcgt.ly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class testController {
	
	@RequestMapping("")
	public String hello() {
		return "hello word";
	}
	
}