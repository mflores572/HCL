package com.mario;

public class Question4 {

	public static void main(String[] args) {
		String first = "first";
		String second = "second";
		System.out.println("first = " + first);
		System.out.println("second = " + second);
		swap(first, second);
	}

	private static void swap(String first, String second) {
		String temp = first;
		first = second;
		second = temp;

		System.out.println("Swapped:");
		System.out.println("first = " + first);
		System.out.println("second = " + second);
	}
}
