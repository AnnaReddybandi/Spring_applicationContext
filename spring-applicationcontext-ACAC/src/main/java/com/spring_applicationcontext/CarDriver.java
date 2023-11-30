package com.spring_applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		       Car car=(Car)ac.getBean("car");
		       System.out.println(car.id);
		       System.out.println(car.name);
		       System.out.println(car.color);
		       System.out.println(car.price);
	}
}
