package com.mario.question3;

public class MembershipCard extends Card {
	Integer rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public Integer getRating() {
		return this.rating;
	}

	public void setHolderName(Integer rating) {
		this.rating = rating;
	}
}
