package com.mario;

import java.util.*;

public class Question3 {
	public static void main(String args[]) {
		// going to use random numbers for test purposes
		Random rand = new Random();
		List<Integer> arr=new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arr.add(rand.nextInt(20));
		}
		System.out.println("Not sorted:");
		System.out.println(arr);
		
		sortAscending(arr);
		
		System.out.println("After sorting:");
		System.out.println(arr);
	}

	public static List<Integer> sortAscending(List<Integer> arr) {
		Collections.sort(arr);
		return arr;
	}
}
