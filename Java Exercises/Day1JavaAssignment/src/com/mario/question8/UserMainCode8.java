package com.mario.question8;

public class UserMainCode8 {
	public static int checkSum(int iPos) {
		String sPos = String.valueOf(iPos);
		int sum = 0;
		for (int i = 0; i < sPos.length(); i++) {
			int temp = Character.getNumericValue(sPos.charAt(i));

			if (temp % 2 != 0)
				sum += temp;
		}
		if (sum % 2 == 0) {
			System.out.println("Sum of " + iPos + " is Even");
			return -1;
		}
		System.out.println("Sum of " + iPos + " is Odd");
		return 1;
	}
}
