package com.spring.appliactioncontext_primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BabyDriver {

	
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(config.class);
		Baby baby=(Baby)ac.getBean("baby");
		
		baby.eat();
	}
}
