package com.java.oops;

public class ConstructorDemo {

	int x;
	int y;

	ConstructorDemo() {// Default Constructor
		x = 10;
		y = 20;
	}

	ConstructorDemo(int a, int b) {// Parameterised Constructor
		x = a;
		y = b;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		ConstructorDemo constructorDemo = new ConstructorDemo();// Invoke Default Constructor
		ConstructorDemo constructorDemo2 = new ConstructorDemo(230, 270);// Invoke Parameterised Constructor

		constructorDemo.display();
		constructorDemo2.display();
	}

}
