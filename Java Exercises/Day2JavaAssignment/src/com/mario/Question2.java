package com.mario;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.print("Enter a word: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		middleChar(str);

	}

	public static String middleChar(String input) {
		System.out.print("Middle character(s) is: ");
		int n = input.length();
		double n1 = (n / 2) - .5;
		double n2 = (n / 2) + .5;
		String ret;

		if (n % 2 != 0) {
			ret = input.charAt(n / 2) + "";
			System.out.println(ret);
			return ret;
		}

		ret = input.charAt((int) n1) + "" + input.charAt((int) n2);
		System.out.println(ret);
		return ret;
	}
}
