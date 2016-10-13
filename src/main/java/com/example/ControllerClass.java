package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerClass {

	@Autowired
	UserRepository userRepo;
	@RequestMapping(value="/test")
	public String test(@RequestParam("name")String name,Model map)
	{
		map.addAttribute("name", name);
		System.out.println("test controller called "+name);
		return "index";
	}
	
	@RequestMapping(value="/get")
	@ResponseBody
	public User get()
	{
		User user = new User("roushan singh","developer",15000l);
		userRepo.save(user);
		System.out.println(user.getId());
		return user;
	}
}
