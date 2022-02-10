package com.ps.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ps.springmvc.entity.Todo;

@Component
public class TodoDao {
	 
	@Autowired
	HibernateTemplate hibernateTemplate;

	
	//for save the data using Hibernate Template 
	@Transactional
	 public int save(Todo t) {
		 int i =(Integer) this.hibernateTemplate.save(t);
		  return i;
	 }
	 
	 // method for retrieve all the todos using hibernate Template
	 
	  public List<Todo> getAll() {
		  List<Todo> todos=(List<Todo>)this.hibernateTemplate.loadAll(Todo.class);
		return todos;
	  }
	
	
}



