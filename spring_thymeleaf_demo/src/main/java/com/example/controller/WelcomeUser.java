package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entries.User;

@Controller
public class WelcomeUser {

	@RequestMapping("/welcome")
	public String welcome(Model model) {
		User user = new User("李明", 20, true);
		user.setRole("admin");
		model.addAttribute("user", user);
		return "welcome";
	}
}
