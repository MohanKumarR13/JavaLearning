package com.java.java.conditions;

public class WhileLoopWithOutCondition {

	public static void main(String[] args) {
		whileLoopWithOutCondition();

	}

	public static void whileLoopWithOutCondition() {
		int i = 1;
		while (true) {
			System.out.println("While Looping ");
			i++;
			if (i == 10) {
				break;
			}
		}
	}

}
