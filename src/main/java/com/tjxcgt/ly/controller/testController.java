package com.tjxcgt.ly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class testController {
	
	@RequestMapping("/1")
	public String hello() {
		return "hello word";
	}
	@RequestMapping("/2")
	public String helloo() {
		return "hello ge ji";
	}
	
}