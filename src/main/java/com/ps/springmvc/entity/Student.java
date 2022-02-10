package com.ps.springmvc.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
	
	    @NotEmpty
	    private int studId;
	    @NotNull
	    private String name;
	    private int age;
	   

	    public int getStudId() {
	        return studId;
	    }

	    public void setStudId(int studId) {
	        this.studId = studId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	    
	  
		@Override
		public String toString() {
			return "Student [studId=" + studId + ", name=" + name + ", age=" + age + "]";
		}


}
