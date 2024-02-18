package com.java.java.assignment;

public class FindTheNumberPositiveNegative {

	public static void main(String[] args) {
		findTheNumberPositiveNegativeMethod1();
		findTheNumberPositiveNegativeMethod2(32);
		findTheNumberRepeative();

	}

	public static void findTheNumberPositiveNegativeMethod1() {
		int a = 5;
		if (a > 0) {
			System.out.println("Positive Number");
		} else if (a < 0) {
			System.out.println("Negative Number");

		} else {
			System.out.println("Number is zero");

		}
	}

	public static void findTheNumberPositiveNegativeMethod2(int no) {
		if (no > 0) {
			System.out.println("Positive Number");
		} else if (no < 0) {
			System.out.println("Negative Number");

		} else {
			System.out.println("Number is zero");

		}
	}
	
	public static void findTheNumberRepeative() {
		int a[] = { 100, 100, 200, 300 };
		int num = 100;
		int count = 0;
		for (int value : a) {
			if (value == num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
