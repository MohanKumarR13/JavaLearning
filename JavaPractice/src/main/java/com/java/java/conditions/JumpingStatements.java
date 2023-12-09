package com.java.java.conditions;

public class JumpingStatements {

	public static void main(String[] args) {
		breakStatement();
		continueStatement();
	}

	public static void breakStatement() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

	}

	public static void continueStatement() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

	public static void orOperator() {
		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i == 5 || i == 7) {
				continue;
			}
			System.out.println(i);
		}

	}
}
