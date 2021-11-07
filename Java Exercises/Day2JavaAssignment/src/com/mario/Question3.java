package com.mario;

import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		numOfVowels(str);
	}

	public static int numOfVowels(String str) {
		int count = 0;
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		for (int i = 0; i < str.length(); i++) {
			char letter = Character.toLowerCase(str.charAt(i));
			if (vowels.contains(letter))
				count += 1;
		}
		
		System.out.print("Number of Vowels: " + count);
		return count;
	}

}