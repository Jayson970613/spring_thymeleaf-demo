package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("msg", "spring-thymeleaf-demo");
		return "hello";
	}
}
