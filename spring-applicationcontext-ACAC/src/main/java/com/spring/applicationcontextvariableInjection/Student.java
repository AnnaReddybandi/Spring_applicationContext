package com.spring.applicationcontextvariableInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("1")
	int id;
	@Value("kittu")
	String name;
	@Value("23")
	int age;
	@Value("galiveedu")
	String loc;
	
}
