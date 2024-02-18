package com.java.string.methods;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// Immutable
		int a[] = { 20, 10, 40, 30, 50 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		// Muttable
		String s = new String("Welcome");
		System.out.println(s);
		String concatString = s.concat("Java");
		System.out.println(s);
		System.out.println(concatString);

	}

}
