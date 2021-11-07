package com.mario;

import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		// going to use random numbers for test purposes
		Random rand = new Random();
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arr.add(rand.nextInt(100));
		}
		System.out.println(arr);
		System.out.println("Select a number from the list: ");

		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();
		scan.close();
		
		search(arr, target);
	}

	public static int search(List<Integer> arr, int target) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == target) {
				System.out.println("Number " + target + " is present at index " + i);
				return i;
			}
		}
		System.out.println("Number " + target + " is not present");
		return -1;
	}

}
