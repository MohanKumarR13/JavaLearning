package com.java.overloading;

public class OverLoadMainMethod {

	public void main(int x) {
		System.out.println(x);
	}

	public void main(int x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		OverLoadMainMethod loadMainMethod = new OverLoadMainMethod();
		loadMainMethod.main(1000);
		loadMainMethod.main(12, 10);

	}

}
