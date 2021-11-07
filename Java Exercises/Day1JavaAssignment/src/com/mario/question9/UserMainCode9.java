package com.mario.question9;

public class UserMainCode9 {
	public static int sumOfSquaresOfEvenDigits(int iPos) {
		String sPos = String.valueOf(iPos);
		int sum = 0;
		for (int i = 0; i < sPos.length(); i++) {
			int temp = Character.getNumericValue(sPos.charAt(i));

			if (temp % 2 == 0)
				sum += temp*temp;
		}
		System.out.println(sum);
		return sum;
	}
}
