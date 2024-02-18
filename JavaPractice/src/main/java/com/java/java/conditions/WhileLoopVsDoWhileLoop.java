package com.java.java.conditions;

public class WhileLoopVsDoWhileLoop {

	public static void main(String[] args) {
		whileLoop();
		whileLoopEvenNumber();
		whileLoopOddNumber();
		whileLoopDesendingOrder();
	}

	public static void whileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println("While Looping " + i);
			i++;
		}
	}

	public static void whileLoopEvenNumber() {
		int i = 2;
		while (i <= 10) {
			System.out.println("Even Numbers " + i);
			i += 2; // i=i+2;
		}
	}

	public static void whileLoopOddNumber() {
		int i = 1;
		while (i <= 10) {
			System.out.println("Odd Numbers " + i);
			i += 2; // i=i+1;
		}
	}

	public static void whileLoopDesendingOrder() {
		int i = 10;
		while (i >= 0) {
			System.out.println("Desending Numbers " + i);
			i--;
		}
	}

}
