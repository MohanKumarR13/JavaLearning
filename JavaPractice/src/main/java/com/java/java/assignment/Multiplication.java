package com.java.java.assignment;

public class Multiplication {

	public static void main(String[] args) {
		multiplicationMethod1();
		multiplicationMethod2();
		tableOf(2);
	}

	public static void multiplicationMethod1() {
		int n = 7;
		for (int i = 1; i <= 10; i++) {

			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	public static void multiplicationMethod2() {
		int n = 7;
		int range = 18;

		int i = 1;

		while (i <= range) {

			System.out.println(n + " * " + i + " = " + n * i);
			i++;
		}

	}

	public static void tableOf(int tableOf) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * tableOf + " ");
		}
	}

}
