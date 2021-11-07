package com.mario;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a single char: ");
		char chInput = scan.next().charAt(0);
		scan.close();
		System.out.println((int) chInput);
	}

}
