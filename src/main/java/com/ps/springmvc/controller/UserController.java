package com.ps.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.springmvc.entity.User;

@Controller
public class UserController {
	
	
	//@RequestMapping(value="/display", method = RequestMethod.GET)
	public String displayUser(Model m) {
		User user = new User();
	   m.addAttribute("user", user);
	   return "/user";
			   
		
		
	}
	
	//@RequestMapping(value="/register",method=RequestMethod.POST)
    public String displayUserDetails(@ModelAttribute User user,Model model){
        model.addAttribute("user", user);
        return "/success";

}
	
}
