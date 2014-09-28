package com.ors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.service.Authentication;
import com.ors.model.LoginCollection;

@Controller
@RequestMapping("/enroll")
public class Enroll {
	@RequestMapping(method=RequestMethod.POST)
	public String enroll(@RequestParam("firstName") String firstName ,
						@RequestParam("lastName") String lastName ,
						@RequestParam("userName") String userName, 
						@RequestParam("password") String password ,
						@RequestParam("emailId") String emailId ,
						ModelMap model){
		Authentication auth = new Authentication();
		LoginCollection login = new LoginCollection();
		
		login = auth.enroll(firstName, lastName, userName, password, emailId);
		model.addAttribute("name",login.getFirstName());
		return "login";
		   		
	}
	

}
