package com.spring_applicationcontext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	int id;
	String name;
	String color;
	double price;
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("TATA")
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	@Value("black")
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	@Value("2000000")
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
