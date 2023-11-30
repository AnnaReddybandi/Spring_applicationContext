package com.spring.appliactioncontext_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {

	@Autowired
	IceCream cream;
	
	   public void eat() {
		   System.out.println("baby crying");
		   cream.eat();
		   System.out.println("babyis happy....");
	   }
}
