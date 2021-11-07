package com.mario;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		System.out.print("Enter 3 Numbers: ");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++)
			arr[i] = scan.nextInt();
		scan.close();

		largestNum(arr);
	}

	public static int largestNum(int[] arr) {

		int max = Integer.MIN_VALUE;
		for(int x: arr)
		{
			if(x>max)
				max=x;
		}
		System.out.println(max);
		return max;
	}

}
