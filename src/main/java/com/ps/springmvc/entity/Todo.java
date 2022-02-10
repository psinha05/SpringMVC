package com.ps.springmvc.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

@Repository
@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	//@NotNull
	//@Size(min=3, message="required")
	private String title;
	private String content;
	private Date   date;
	
	//private static int counter=1;
	  // (for manually increment the id value)
	
	public Todo(int id, String title, String content, Date date) {
		super();
		this.id=id;
		this.title = title;
		this.content = content;
		this.date = date;
		
		}
	
	
	
	public Todo() {
		super();
		//id = ++counter;
		
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", content=" + content + ", date=" + date + "]";
	}



	
}
