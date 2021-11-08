package com.mario.question7;

class Cycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class Bike extends Cycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	Bike() {
		System.out.println("Hello I am a Bike I am " + define_me());
		// had to change to super.define_me() because it has to call from parent
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}

class InheritenceExample {
	public static void main(String[] args) {
		Bike M = new Bike();
	}
}