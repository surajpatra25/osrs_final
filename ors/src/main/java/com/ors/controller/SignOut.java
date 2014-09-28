package com.ors.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/signout")
public class SignOut {
@RequestMapping(method=RequestMethod.GET)
	public String signout(HttpSession session){
		session.invalidate();
		return "index";
	}

}
