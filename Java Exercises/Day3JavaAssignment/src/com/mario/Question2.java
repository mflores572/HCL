package com.mario;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		dToH(str);
	}

	public static String dToH(String str) {
		str = str.replace("d", "h");
		System.out.println(str);
		return str;
	}
}
