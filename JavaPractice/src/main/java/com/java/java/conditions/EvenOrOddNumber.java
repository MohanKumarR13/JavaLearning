package com.java.java.conditions;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		oddOrEven();
	}

	public static void oddOrEven() {
		int d;
		Scanner scanner = new Scanner(System.in);
		d = scanner.nextInt();
		if (d % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
