package com.mario.question6;

import java.util.Random;

public class Addition {

	public static void main(String args[]) {
		// going to use random numbers for test purposes
		Random rand = new Random();
		int[] arr = new int[6];
		
		for (int i = 0; i < 6; i++) {
			arr[i] = rand.nextInt(20);
		}

		add(arr);
	}

	public static void add(int[] arr) {
		int sum = 0;
		int n = arr.length;
		String equation = "";
		
		for (int i = 0; i < n; i++) {
			equation += arr[i];
			sum += arr[i];

			if (i > 0) {
				System.out.println(equation + " = " + sum);
			}
			if (i != (n - 1)) {
				equation += " + ";
			}
		}
	}
}
