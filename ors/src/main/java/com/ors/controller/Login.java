package com.ors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.service.Authentication;
import com.ors.model.LoginCollection;

@Controller
@RequestMapping("/login")
public class Login {
	@RequestMapping(method=RequestMethod.POST)
	public String login(@RequestParam("user_name") String name, @RequestParam("password") String passwd ,ModelMap model){
       System.out.println(name +"----name is");
       String Login = "login";
       Authentication auth = new Authentication();
       LoginCollection login = new LoginCollection();
       login = auth.auth(name, passwd);
       System.out.println("call to auth method is over" + login);
       if (login==null){
    	   System.out.println("login values"+login);
    	   model.addAttribute("name","invalid");
    	   Login="register";
   	    
       }
       else {
    	   
    	   System.out.println("Good user name");
    	   System.out.println(passwd +"----pwd is");
    	   System.out.println("login values in else"+login);
   		model.addAttribute("name", login.getFirstName());
   	    System.out.println("i m in login");
       }
       return Login;
       
	}
}


