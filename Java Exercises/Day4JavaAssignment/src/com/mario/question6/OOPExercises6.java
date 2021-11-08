package com.mario.question6;

/* Show the output of the following applications.  */

/* OUTPUT IS:
 * 
 	a in A = 100
	a in B = 123
	a in B = 123
	a in C = 543
	a in C = 543
	a in C = 543
 * 
 * Output is also in "Question6 Ouput.txt" located in same folder
 */

public class OOPExercises6 {

	static int a = 555;

	public static void main(String[] args) {

		A objA = new A();

		B objB1 = new B();

		A objB2 = new B();

		C objC1 = new C();

		B objC2 = new C();

		A objC3 = new C();

		objA.display();

		objB1.display();

		objB2.display();

		objC1.display();

		objC2.display();

		objC3.display();
	}

}