package com.ps.springmvc.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ps.springmvc.dao.TodoDao;
import com.ps.springmvc.entity.Todo;

@Controller
public class HomeController {
	
	//@Autowired
	//ServletContext context;
	
	@Autowired
	TodoDao todoDao;

	@RequestMapping("/home")
	public String home(Model m) {
		String str = "home";
		m.addAttribute("page", str);
		 // context commented now mysql db used for save purpose
		//List<Todo> l= (List<Todo>) context.getAttribute("list");
		//m.addAttribute("todos", l);
		List<Todo> list1=this.todoDao.getAll();
		m.addAttribute("todos", list1);
		return "home";
	}

	@RequestMapping("/add")
	public String add(Model m) {
		Todo  t = new Todo();
		m.addAttribute("page", "add");
		m.addAttribute("todo", t);
		return "home";
	}
	
	@RequestMapping(value= "/saveTodo", method=RequestMethod.POST)
	//public String saveTodo(@Valid @ModelAttribute("todo") Todo t, Model m, BindingResult br) {
		public String saveTodo(@ModelAttribute("todo") Todo t, Model m) {
		/*
		 * if(br.hasErrors()) { return "home"; } else {
		 */
		t.setDate(new Date());
		
		// comment out for context as it not further used, data now savein db
		// commented as on 07th Sep21
		//List<Todo> list1 = (List<Todo>) context.getAttribute("list");
		//list1.add(t);
		this.todoDao.save(t);
		m.addAttribute("msg", "successfully added..");
		return "home";
		//}
	}
	
	
	
	  @RequestMapping(value = "/deleteTodo", method = RequestMethod.GET) public
	  void deleteTodo(Model m, @RequestParam int id) {
	  System.out.println("within the delete Todos" + id);
	  
	  
	  }
	 

}
