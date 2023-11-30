package com.spring_withoutAnnotateComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan(basePackages = "com.spring_withoutAnnotateComponent" )
/*
 * component scan is used to specify the package name to our container
 */



public class config {

	@Bean("mypen")
	/*
	 * @bean is used to get the bean object of a pojo classes which is not annotated with 
	 * component . we majorly use @Bean to get the Objects of in built pojo classes because
	 * classes are not annotated with @component.
	 */
	public Pen getPen() {
		return new Pen();
	}
}
