package com.mario;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 3 Numbers: ");
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		int thirdNum = scan.nextInt();
		scan.close();
		printAvg(firstNum, secondNum, thirdNum);
	}

	static void printAvg(int first, int second, int third) {
		System.out.println((first + second + third) / 3);
	}

}
