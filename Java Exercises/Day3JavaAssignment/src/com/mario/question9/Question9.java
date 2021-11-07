package com.mario.question9;

import java.util.Scanner;

public class Question9 { // Main
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print("Enter a char: ");
		char c = scan.next().charAt(0);
		scan.close();
		
		System.out.println(UserMainCode9.reshape(str, c));
	}
}