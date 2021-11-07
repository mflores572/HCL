package com.mario;

public class Question7 {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.print(i);
				System.out.println(": fizz buzz");
			} else if (i % 5 == 0) {
				System.out.print(i);
				System.out.println(": buzz");
			} else if (i % 3 == 0) {
				System.out.print(i);
				System.out.println(": fizz");
			}
		}
	}
}
