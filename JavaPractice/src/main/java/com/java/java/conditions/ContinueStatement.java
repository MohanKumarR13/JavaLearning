package com.java.java.conditions;

public class ContinueStatement {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
			
			
			if (i == 5 |i==7|i==9) {
				continue;
			}
			System.out.println(i);
		}
	}
}
