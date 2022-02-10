package com.ps.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ps.springmvc.entity.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		Student st = new Student();
		System.out.println("1111111111111111111");
		return new ModelAndView("studentForm", "command", new Student());
	}

		
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute("student") Student student, BindingResult result,Model model) {
     model.addAttribute("student", student);
      if(result.hasErrors()) {
          return "student";
      }
     
      return "success";
    }
	
	
	/*@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			System.out.println("having Validation Errorrrrrrrrrr");
			ModelAndView mv= new ModelAndView("studentForm");
			mv.addObject("student", new Student());
			return mv;
		} else { 		
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getStudId());
		ModelAndView mv1= new ModelAndView("success");
		//model.addAttribute(stud, student);
		System.out.println(student);
		System.out.println("Hidden Msg:" + student.getHiddenMsg());
		return mv1;
	}*/

	
}
