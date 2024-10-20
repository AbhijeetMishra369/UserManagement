package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.entity.User;
import com.ashokit.service.UserService;

@Controller
public class UserController 
{
	@Autowired
	private UserService service;
	@GetMapping("/")
	public String loadForm(Model model)
	{
		model.addAttribute("user",new User());
		return "index";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user)
	{
		System.out.println(user);
		service.registerUser(user);
		return"home";
	}

}
