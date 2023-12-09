package com.java.java.practice;

public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// Arithmetic Operators
		System.out.println("---Arithmetic Operators---");

		System.out.println("Sum Of a and b is" + (a + b));
		System.out.println("Difference Of a and b is" + (a = b));
		System.out.println("Multiply Of a and b is" + (a * b));
		System.out.println("Division Of a and b is" + (a / b));
		System.out.println("Mod Div Of a and b is" + (a % b));

		// Relational Operators
		// Always Returns boolean values
		System.out.println("---Relational Operators---");

		System.out.println((a == b)); // true
		System.out.println((a > b)); // false
		System.out.println((a < b)); // false
		System.out.println((a >= b)); // true
		System.out.println((a <= b)); // true
		System.out.println((a != b)); // false

		// Logical Operators && || ! woks b\w two boolean
		System.out.println("---Logical Operators---");
		boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		System.out.println("---Increment And Decrement Operators---");
		a = 10;
		// a=a+1;
		a++;
		System.out.println(a);

		b = 10;
		// b=b-1;
		b--;
		System.out.println(a);

	}

}
