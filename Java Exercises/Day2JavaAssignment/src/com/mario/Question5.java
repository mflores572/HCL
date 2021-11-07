package com.mario;

class A {
	String a = "from class A\n";
}

class B extends A {
	String b = "from class B\n";
}

class Inherit extends B{
	String c = a + b + "and finally from Inherit class";
}

public class Question5 extends B {
	public static void main(String[] args) {
		Inherit inherit = new Inherit();
		System.out.println(inherit.c);
	}
}