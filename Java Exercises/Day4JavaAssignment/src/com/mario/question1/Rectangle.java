package com.mario.question1;

public class Rectangle extends Shape { //Question 1
	private Integer length;
	private Integer breadth;
	private String name;

	public Rectangle(String name, Integer length, Integer breadth) {
		super(name);
		this.name = name;
		this.length = length;
		this.breadth = breadth;
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
	public Integer getBreadth() {
		return this.breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public float calculateArea() {
		return (float) (breadth * length);
	}
}
