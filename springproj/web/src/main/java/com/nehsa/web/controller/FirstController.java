package com.nehsa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@GetMapping("/hello")
	public String hello(Model model){
		
		model.addAttribute("name", "James");
		return "welcomeSpring";
	}
	
}
