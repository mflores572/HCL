package com.mario;

import java.util.*;

public class Question7 {
	public static void main(String args[]) {
		System.out.print("Enter String: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		System.out.print("Is Pangram? ");
		System.out.println(isPangram(str));
	}

	public static boolean isPangram(String str) {
		Set<Character> alphabet = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))==true) {
				alphabet.add(Character.toLowerCase(str.charAt(i)));
			}
		}
		if(alphabet.size()==26)
			return true;
		return false;
	}
}