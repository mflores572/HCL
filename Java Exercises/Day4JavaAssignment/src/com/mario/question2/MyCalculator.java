package com.mario.question2;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

public class MyCalculator implements AdvancedArithmetic { // Question 2
	
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		AdvancedArithmetic calc = new MyCalculator();
		System.out.println("I implemented AdvancedArithmetic: " + calc.divisor_sum(input));
	}

	public int divisor_sum(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}

}