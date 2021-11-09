package com.mario;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		toLower(str);
	}


	public static String toLower(String str) {
		str=str.toLowerCase();
		System.out.println(str);
		return str;
	}

}