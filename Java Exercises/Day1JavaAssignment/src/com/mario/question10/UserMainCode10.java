package com.mario.question10;

public class UserMainCode10 {
	
	static String getLargestWord(String sentence) {
		String[] arr = sentence.split("\\s+");
		int maxIdx = -1;
		int maxSize = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxSize) {
				maxSize = arr[i].length();
				maxIdx = i;
			}
		}
		System.out.println(arr[maxIdx]);
		return arr[maxIdx];
	}
}
