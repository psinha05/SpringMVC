package com.ps.springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	
	@RequestMapping("/hhh")
	public ModelAndView check() {
		System.out.println("within checkkkkkkkkk");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Harsh");
		mv.addObject("add", "Patna");
		mv.addObject("contact", 123456789);
		
		LocalDateTime CurrentTime = LocalDateTime.now();
		mv.addObject("time", CurrentTime);
		mv.setViewName("test");
		
		
		return mv;
	}
}
