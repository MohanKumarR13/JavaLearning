package com.java.java.assignment;

public class Calculation {

	int sum(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}

	int sumOf(int x, int y, int z) {
		System.out.println(x + y + z);
		return x + y + z;
	}

	double sumOfTwoDoubles(double x, double y) {
		System.out.println(x + y);
		return x + y;
	}

	double sumOfThreeDoubles(double x, double y, double z) {
		System.out.println(x + y + z);
		return x + y + z;
	}

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		int sum = calculation.sum(10, 20);
		System.out.println("Sum Of Two Integers " + sum);
		int sumOf = calculation.sumOf(30, 30, 40);
		System.out.println("Sum Of Three Integers " + sumOf);
		double sumOfTwoDoubles = calculation.sumOfTwoDoubles(30.50, 40.50);
		System.out.println("Sum Of Two Doubles " + sumOfTwoDoubles);
		double sumOfThreeDoubles = calculation.sumOfThreeDoubles(30.50, 40.50, 29.00);
		System.out.println("Sum Of Three Doubles " + sumOfThreeDoubles);

	}

}
