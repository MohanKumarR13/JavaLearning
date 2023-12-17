package com.java.superkeyword;

public class Animal {
	String color = "white";

	void eating() {
		System.out.println("Eating.....");
	}

	Animal() {
		System.out.println("Animal Lives...");
	}
}

class Dog extends Animal {
	String color = "black";

	Dog() {
		super();
		System.out.println("Dog is Lives...");
	}

	void display() {
		System.out.println(super.color);
		System.out.println(color);
	}

	void eating() {
		super.eating();
		System.out.println("Eating Meat....");
	}

}
