package com.mario.question3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Select the Card\n1.Payback Card\n2.Membership Card ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Enter the Card Details (Split by '|'): ");
		String details = scan.next();
		String[] d = details.split("\\|");

		if (input == 1) {
			System.out.println("Enter points on card: ");
			Integer points = scan.nextInt();
			System.out.println("Enter Amount: ");
			Double amount = scan.nextDouble();
			PaybackCard payback = new PaybackCard(d[0], d[1], d[2], points, amount);

			System.out.println(payback.getHolderName() + "'s Payback Card Details: ");
			System.out.println("Card Number " + payback.getCardNumber());
			System.out.println("Expiry Date " + payback.getExpiryDate());
			System.out.println("Points Earned " + payback.getPointsEarned());
			System.out.println("Total Amount " + payback.getTotalAmount());

		} else if (input == 2) {
			System.out.println("Enter Rating: ");
			Integer rating = scan.nextInt();
			MembershipCard member = new MembershipCard(d[0], d[1], d[2], rating);

			System.out.println(member.getHolderName() + "'s Membership Card Details: ");
			System.out.println("Card Number " + member.getCardNumber());
			System.out.println("Expiry Date " + member.getExpiryDate());
			System.out.println("Rating " + member.getRating());
		}
		scan.close();
	}
}
