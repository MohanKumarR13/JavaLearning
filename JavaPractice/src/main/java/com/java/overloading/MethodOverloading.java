package com.java.overloading;

public class MethodOverloading {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, double b) {
		System.out.println(a + b);

	}

	void add(double a, double b) {
		System.out.println(a + b);

	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.add(12, 13);
		methodOverloading.add(13, 13);
		methodOverloading.add(11, 13);
		methodOverloading.add(12, 13, 11);

	}

}
