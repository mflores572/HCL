package com.mario.question9;

/*
 * OUTPUT IS:
 
 	true
	true
	false
	false
	true
	false
	false
	true
	
 * Output is also in "Question9 Output.txt" located in same folder
 * 
 */

class Parent {
}

class Child1 extends Parent {
}

class Child2 extends Parent {
}

class Test {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

		System.out.println(c1 instanceof Parent);
		System.out.println(c2 instanceof Parent);
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);

		p = c1;

		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);

		p = c2;

		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);
	}
}