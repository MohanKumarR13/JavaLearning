package com.java.oops;

public class Calculation {
	int x = 10;
	int y = 20;

	// Case1- Not Taking Parameters And Also Not Returned Any Value
	void sum() {
		System.out.println(x + y);
	}

	// Case2- Not Taking Parameters But Returning Value
	int sumOf() {
		return x + y;
	}

	// Case3- Taking Parameters But Not Returning Any Value
	void sumOfTwoIntegers(int a, int b) {
		System.out.println(a + b);
	}

	// Case4- Method Is Taking Parameters And Also Returning Value
	int sumOfTwoInt(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		calculation.sum();
		int result = calculation.sumOf();
		System.out.println(result);
		calculation.sumOfTwoIntegers(20, 30);
		System.out.println(calculation.sumOfTwoInt(250, 200));

	}

}
