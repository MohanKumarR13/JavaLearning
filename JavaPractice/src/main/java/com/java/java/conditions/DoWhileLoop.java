package com.java.java.conditions;

public class DoWhileLoop {

	public static void main(String[] args) {
		doWhile();
		doWhileCondition();
	}

	public static void doWhile() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

	public static void doWhileCondition() {
		int i = 20;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

}
