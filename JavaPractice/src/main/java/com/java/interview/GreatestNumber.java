package com.java.interview;

public class GreatestNumber {

	static int greaterNo(int x, int y) {
		return (Math.abs(x - y) + (x + y)) / 2;

	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int large=a>b?a:b;
		System.out.println(large);
		System.out.println(greaterNo(a, b));

	}
	
	
	
	
	
	
	
	

}
