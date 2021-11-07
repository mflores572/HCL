package com.mario.question10;

import java.util.Scanner;

public class Question10 { //Main
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = scan.nextLine();
		scan.close();
		UserMainCode10.getLargestWord(sentence);
	}
}
