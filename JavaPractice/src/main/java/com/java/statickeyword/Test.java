package com.java.statickeyword;

import java.io.PrintStream;
class System {
	static PrintStream out;
}
public class Test {
	static String s = "name";

	public static void main(String[] args) {
		Test.s.length();
		System.out.println();
	}
}


