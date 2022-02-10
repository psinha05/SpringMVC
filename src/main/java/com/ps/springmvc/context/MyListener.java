package com.ps.springmvc.context;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.ServletContext;
import com.ps.springmvc.entity.Todo;


public class MyListener implements ServletContextListener {
	
	public void contextDestroyed(ServletContextEvent sce) {}
	
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		
		List<Todo> list = new ArrayList<Todo>();
		context.setAttribute("list", list);
		System.out.println("context created....");
		
		
		
		
	}
	 

}
