package com.spring.applicationcontextWithContructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	private int id;
	private String name;
	private String location;
    private String Cemail;
    
	public College(@Value("1") int id,@Value("Sv") String name,@Value("Tirupathi") String location,@Value("sv@gmail.com") String cemail) {
	
		this.id = id;
		this.name = name;
		this.location = location;
		Cemail = cemail;
	}
    
public void details() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(location);
	System.out.println(Cemail);
}
    
}
