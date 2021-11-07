package com.mario;

import java.util.Scanner;

public class Question6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		scan.close();

		System.out.print("Is Palindrome? ");

		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while (left < right) {
			if(str.charAt(left)!=str.charAt(right))
				return false;
			right--;
			left++;
		}
		return true;
	}
}