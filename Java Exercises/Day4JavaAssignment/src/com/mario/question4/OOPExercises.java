package com.mario.question4;

/* The following Java applications contain errors. 
 * Point out the statement(s) that contain errors. 
 * Explain what each of the errors is, and how it can be fixed. 
 * */

public class OOPExercises {

	public static void main(String[] args) {
		A objA = new A();

		System.out.println("in main(): ");
		
		//trying to access private member a
		//if it were to be changed must invoke getA()
		//Wrong Way:
		//System.out.println("objA.a = " + objA.a);
		
		//Correct Way:
		System.out.println("objA.a = " + objA.getA());

		//trying to access private member a
		//if it were to be changed must invoke setA(int)
		//Wrong Way:
		//objA.a = 222;
		
		//Correct Way:
		objA.setA(222);

	}

}