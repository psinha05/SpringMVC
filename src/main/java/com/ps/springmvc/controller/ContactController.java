package com.ps.springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ps.springmvc.dao.*;
import com.ps.springmvc.entity.Contact;
import com.ps.springmvc.service.ContactService;


@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	 @ModelAttribute
	 public void commonData(Model model) {
		 model.addAttribute("hd", "Learning Code for Spring");
		 
	 }
	
	@RequestMapping("/show")
	public String showForm() {
		System.out.println("my fommmmmmmmm");
		return "contact";
	}
	
	
	// Method 1, using the @ModelAttribute to transfer the data from view to controller
		
	@RequestMapping(path="/signup", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute Contact contact, Model m) {
		int createdUser = this.contactService.createContact(contact);
		m.addAttribute("msg", "User created with Id: " + createdUser);
		
		/*  31-Jan-22
		 *  @ModelAttribute will 3 works for use
		 *  a). create Contact object and set all its value in @modelattribute
		 *  b). set the value in @Model
		 *  c). forwared the set value to view page to finally 
		 * 
		 * 
		this use for testing purpose for create contact object and set the value
		from view and send it to final Jsp page for show the entered form data
		
		Contact c= new Contact();
		c.setName(name);
		c.setEmail(email);
		c.setPassword(password);
		*/
		
		//  no need to set the value using model, ModelAttribute will set the value
		// using the User object and forwarded to the Final Jsp page
		
		//m.addAttribute("contact", contact);
		
		
		// for @RequestParam to set for JSP
		//m.addAttribute("n", name);
		//m.addAttribute("e", email);
		//m.addAttribute("p", password);
		
		return "final";
	}
	
	
	
	
	
	// 2. method to transfer data from View to Controller, using @RequestParam
	// @RequestParam("Form_Data) String Variable - form-data mapped with string var
			
	/*@RequestMapping(path="/signup", method=RequestMethod.POST)
	public String myForm(@RequestParam ("name") String name, 
			@RequestParam ("email") String email,
			@RequestParam ("password") String password, Model m) {
		m.addAttribute("n", name);
		m.addAttribute("e", email);
		m.addAttribute("p", password);
		
		return "final";
	}
	*/
	/* method 1, using HttpServetRequest to get the value from view to controller
	@PostMapping(path="/signup")
	public String formData(HttpServletRequest req) {
		String n= req.getParameter("name");
		String e= req.getParameter("exampleInputEmail1");
		String p= req.getParameter("password");
		      
		System.out.println("test hereeeeeeeeeee----->" + n + "::" + e + "::" + p);
		
		return "final";
	}
*/
}
