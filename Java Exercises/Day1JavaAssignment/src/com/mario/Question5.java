package com.mario;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		scan.close();

		isPrime(input);
	}

	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime == false) {
			System.out.println("False, " + num + " IS NOT a prime number");
			return prime;
		}
		System.out.println("True, " + num + " IS a prime number");
		return prime;

	}

}
