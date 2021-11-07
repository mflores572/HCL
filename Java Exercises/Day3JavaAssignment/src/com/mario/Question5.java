package com.mario;

import java.util.Scanner;

public class Question5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		System.out.println("Enter 2 indexes: ");
		int idx1 = scan.nextInt();
		int idx2 = scan.nextInt();
		scan.close();

		getRange(str, idx1, idx2);
	}

	public static String getRange(String str, int left, int right) {
		String ret = "";

		for (int i = left; i <= right; i++) {
			ret += str.charAt(i);
		}

		System.out.println(ret);
		return ret;
	}

}
