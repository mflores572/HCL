package com.mario.question5;

/* Show the output of the following applications.  */

/* OUTPUT IS:
 * 
 	in the constructor of class FirstClass: 
	a = 100
	a = 333
	-----in the constructor of class B: 
	b = 123.45
	b = 3.14159
	in main(): 
	objA.a = 333
	objB.b = 3.14159
	objA.a = 222
	objB.b = 333.33
 * 
 * Output is also in "Question5 Ouput.txt" located in same folder
 */

public class OOPExercises5 {

	public static void main(String[] args) {

		FirstClass objA = new FirstClass();

		SecondClass objB = new SecondClass();

		System.out.println("in main(): ");

		System.out.println("objA.a = " + objA.getFirstClass());

		System.out.println("objB.b = " + objB.getSecondClass());

		objA.setFirstClass(222);

		objB.setSecondClass(333.33);

		System.out.println("objA.a = " + objA.getFirstClass());

		System.out.println("objB.b = " + objB.getSecondClass());

	}

}