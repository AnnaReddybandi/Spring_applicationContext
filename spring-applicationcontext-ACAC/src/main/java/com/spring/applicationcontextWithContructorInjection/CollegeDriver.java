package com.spring.applicationcontextWithContructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeDriver {

	public static void main(String[] args) {

		ApplicationContext ac= new AnnotationConfigApplicationContext(configOfCollege.class);
		        College college=(College) ac.getBean("college");
		       college.details();
		
		
		
	}
	
	
	
	
	
	
	        
}
