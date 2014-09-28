package com.ors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.service.Authentication;
import com.ors.model.FacebookData;
import com.ors.model.FacebookLoginCollection;
import com.ors.model.LoginCollection;


@Controller
@RequestMapping("/fblogin")
public class FbLogin {
	
  @RequestMapping(method=RequestMethod.GET)
  public String login(ModelMap model){
	 
	  
	  return "login";
  }
  @RequestMapping(method=RequestMethod.POST)
  public String loginPost(@ModelAttribute FacebookData fblogin, ModelMap model){
	    Authentication auth = new Authentication();
		FacebookLoginCollection login = new FacebookLoginCollection();
		
		login = auth.fbenroll(fblogin.getId(), fblogin.getEmail(), fblogin.getFirst_name(), 
				fblogin.getGender(),fblogin.getLast_name(),fblogin.getLocale(),fblogin.getTimezone(),fblogin.getUpdated_time());
	  System.out.println("Nice, hello ---"+ login.getFb_first_name());
	  model.addAttribute("name",login.getFb_first_name());
	  return "login";
  }
	     
}
