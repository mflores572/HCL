package com.mario.question1;

public class Circle extends Shape { // Question 1
	private Integer radius;
	private String name;

	public Circle(String name, Integer radius) {
		super(name);
		this.name = name;
		this.radius = radius;
	}

	public Integer getRadius() {
		return this.radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public float calculateArea() {
		return (float) ((float) (radius * radius) * 3.14);
	}
}