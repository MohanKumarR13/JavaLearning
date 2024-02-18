package com.java.string.methods;

public class StringComparision {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "welcome";

		System.out.println(s1 = s2);
		System.out.println(s1.equals(s2));

		String string1 = new String("welcome");
		String string2 = new String("welcome");
		System.out.println(string1);
		System.out.println(string2);

		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));

		String s3 = "abc";
		String s4 = new String("abc");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		comp();

	}

	static void comp() {
		String s3 = "abc";
		String s4 = new String("abc");
		String s5 = s4;
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));

		System.out.println(s3 == s5);
		System.out.println(s3.equals(s5));
	}
}
