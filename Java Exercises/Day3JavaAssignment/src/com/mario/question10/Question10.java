package com.mario.question10;

import com.hcl.Calculator;

public class Question10 { //testing com.hcl.Calculator
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.print("Testing 10+40 from com.hcl.Calculator: ");
		System.out.println(calc.add(10, 40));
	}
}