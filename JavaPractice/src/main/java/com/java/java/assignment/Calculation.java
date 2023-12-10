package com.java.java.assignment;

public class Calculation {
	int x = 10;
	int y = 20;
	int z = 30;

	// Case1- Not Taking Parameters And Also Not Returned Any Value
	void sum() {
		System.out.println(x + y + z);
	}

	// Case2- Not Taking Parameters But Returning Value
	int sumOf() {
		return x + y + z;
	}

	// Case3- Taking Parameters But Not Returning Any Value
	void sumOfTwoIntegers(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// Case4- Method Is Taking Parameters And Also Returning Value
	int sumOfTwoInt(int a, int b,int c) {
		return a + b+c;
	}

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		calculation.sum();
		int result = calculation.sumOf();
		System.out.println(result);
		calculation.sumOfTwoIntegers(20, 30, 10);
		System.out.println(calculation.sumOfTwoInt(250, 200,50));

	}

}
