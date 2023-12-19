package com.java.exception;

public class ExceptionExample {
	public static void arithmeticException() {
		System.out.println("Progress is Started");
		System.out.println("Progress is in Progress");

		int a = 100;
		int result = 0;
		try {
			// System.out.println(a / 0); // This Arithmetic Example
			result = a / 2;
		} catch (ArithmeticException e) {
			System.out.println("Entered in to catch block");
		}
		System.out.println(result);
		System.out.println("Progress is Completed");
		System.out.println("Progress is Exited");
	}

	public static void nullPointerException() {
		String s = null;
		try {
			System.out.println(s.length());// Null Pointer Exception
		} catch (Exception e) {
			System.out.println("Entered in to catch block");
		}
	}

	public static void numberFormatException() {
		String j = "abc";
		int i = Integer.parseInt(j);
		System.out.println(i);// Number Format Exception

	}

	public static void arrayIndexOutOfBoundsException() {
		int c[] = new int[5];
		c[10] = 50;
		System.out.println(c[10]); // ArrayIndexOutOfBoundsException

	}

	public static void main(String[] args) {
		arithmeticException();
		nullPointerException();
		numberFormatException();
		arrayIndexOutOfBoundsException();

	}

}
