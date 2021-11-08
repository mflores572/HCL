package com.mario.question1;

public abstract class Shape { //Question 1
	protected String name;

	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract float calculateArea();
}
