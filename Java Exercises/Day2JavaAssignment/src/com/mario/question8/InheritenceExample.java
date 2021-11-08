package com.mario.question8;

class Animal {

	void walk() {
		System.out.println("I am walking");
	}
}

class Dog extends Animal {

	void eat() {
		System.out.println("I am eating");
	}

	void bark() { // declared bark method and it prints when called
		System.out.println("I am barking");
	}
}

public class InheritenceExample {

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.walk();
		dog.eat();
		dog.bark(); // had to add this method call to print missing item
	}
}