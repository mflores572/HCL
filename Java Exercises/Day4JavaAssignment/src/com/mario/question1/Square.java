package com.mario.question1;

public class Square extends Shape { //Question 1
	private Integer side;
	private String name;

	public Square(String name, Integer side) {
		super(name);
		this.name = name;
		this.side = side;
	}

	public Integer getSide() {
		return this.side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public float calculateArea() {
		return (float) (side * side);
	}
}
