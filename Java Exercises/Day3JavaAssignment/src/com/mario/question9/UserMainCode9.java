package com.mario.question9;

public class UserMainCode9 {
	public static String reshape(String str, char c) {
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
			if (i != 0)
				reverse += c;
		}
		return reverse;
	}
}