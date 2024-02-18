package com.java.java.practice;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int x = (a < b) ? a : b;
		System.out.println(x);

		int y = (1 == 1) ? 10 : 20;
		System.out.println(y);

		int personage = 10;
		String result = (personage >= 18) ? "Eligible" : "Not Elegibe";
		System.out.println(result);
	}

}
