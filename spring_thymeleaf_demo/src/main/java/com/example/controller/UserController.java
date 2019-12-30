package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserServiceImpl;

@RestController()
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("index")
	public String index() {
		return "hello user";
	}
	
	@RequestMapping("/queryUserById")
	public User selectUserById(int id) {
		System.out.println("id:" + id);
		User user = userService.selectByPrimaryKey(id);
		System.out.println(user.toString());
		return user;
	}
	
	@RequestMapping("/insert")
	public User insertUser(String name) {
		User user = new User();
		user.setUserName(name);
		int result = userService.insert(user);
		System.out.println("result:" + result);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping("/insertSelective")
	public User insertSelectiveUser(String name) {
		User user = new User();
		user.setUserName(name);
		int result = userService.insertSelective(user);
		System.out.println("result:" + result);
		System.out.println(user);
		return user;
	}
}
