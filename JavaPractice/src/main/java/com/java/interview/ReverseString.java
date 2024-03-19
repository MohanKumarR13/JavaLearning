package com.java.interview;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Welcome";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		input1.reverse();

		// print reversed String
		System.out.println(input1);

		anotherString();
		anotherStringWithLogical();

	}

	public static void anotherString() {
		String s = "Kite";
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		builder.reverse();
		System.out.println(builder);
	}
	
	public static void anotherStringWithLogical() {
		String s = "Kite";
		String emp="";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			emp=ch+emp;
		}
		System.out.println(emp);
	
	}
}
