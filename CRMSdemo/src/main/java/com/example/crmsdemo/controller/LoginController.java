package com.example.crmsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.example.crmsdemo.entity.Users;
import com.example.crmsdemo.service.LoginService;


@Controller
@RequestMapping("/users")
public class LoginController{
	
	@Autowired
	private LoginService loginService;
	
	public LoginController(LoginService theLoginService)
	{
		loginService = theLoginService;
	}
	@GetMapping("/home")
	public String home(Model theModel)
	{
		return "users/home";
	}
	 
	@GetMapping("/login")
	public String login(@ModelAttribute("usersname") String username) {
		
		loginService.findbyUsername(username);
		
//		if(username=="Admin123@gmail.com")
//		{
//			return "users/cardetails";
//		}
//		else
		return "users/login";
	}
	
	
     @GetMapping("/register_form")
     public String register(Model theModel)
     {
    	 Users theUsers = new Users();
    	 
    	 theModel.addAttribute("users", theUsers);
    		
    	 return "users/register_form";
    	 
     }
      
     
     @PostMapping("/saveuser")
 	 public String save(@ModelAttribute("users") Users theUsers) {
 		
 		// save the employee
 		loginService.save(theUsers);
 		
 		// use a redirect to prevent duplicate submissions
 		return "redirect:/users/login";
 	}
     
     
}
