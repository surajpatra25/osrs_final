package com.ors.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class Register {
	@RequestMapping(method = RequestMethod.POST)
	public String register(ModelMap model) {
		  model.addAttribute("message", "Hello Spring MVC Framework!");
	      System.out.println("i m in register");
	      return "register";
	}
	@RequestMapping(method = RequestMethod.GET)
	public String registerme(ModelMap model) {
		  model.addAttribute("message", "Hello Spring MVC Framework!");
	      System.out.println("i m in register");
	      return "register";
	}

}
