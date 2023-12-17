package com.java.thiskeyword;

public class ThisKeyword {
	int a, b; // Instance Variable or Class Variables

	void getValues(int x, int y) {// Method variable/external variables
		this.a = x;
		this.b = y;
	}

	void printValue() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeyword thisKeyword = new ThisKeyword();
		thisKeyword.getValues(10, 20);
		thisKeyword.printValue();
	}
}
