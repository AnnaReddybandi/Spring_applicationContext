
package com.spring_withoutAnnotateComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PenDriver {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(config.class);

		Pen pen = (Pen) ac.getBean("mypen");
		pen.write();
	}
}
