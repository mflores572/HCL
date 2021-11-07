package com.mario.question8;

import java.util.Scanner;

public class Question8 { // Main

	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		scan.close();
		
		UserMainCode8.getString(str);
	}

}
