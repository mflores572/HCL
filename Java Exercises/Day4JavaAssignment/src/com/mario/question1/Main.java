package com.mario.question1;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle("Circle", 25);
		Shape square = new Square("Square", 10);
		Shape rectangle = new Rectangle("Rectangle", 10, 5);

		System.out.print("Area of " + circle.getName() + " is ");
		System.out.printf("%.2f\n", circle.calculateArea());
		System.out.print("Area of " + square.getName() + " is ");
		System.out.printf("%.2f\n", square.calculateArea());
		System.out.print("Area of " + rectangle.getName() + " is ");
		System.out.printf("%.2f\n", rectangle.calculateArea());
	}
}
