package com.java.constructor;

public class ConstructorDemo {
	int x, y;

	ConstructorDemo() {
		x = 100;
		y = 200;
	}

	ConstructorDemo(int a, int b) {
		x = a;
		y = b;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// ConstructorDemo constructorDemo=new ConstructorDemo(); //Default
		// ConstructorDemo
		ConstructorDemo constructorDemo = new ConstructorDemo(1, 2);// Parameterized ConstructorDemo

		constructorDemo.sum();
	}
}
