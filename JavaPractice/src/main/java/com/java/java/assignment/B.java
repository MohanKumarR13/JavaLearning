package com.java.java.assignment;

interface A {
	int j = 12;
	int k = 34;

	void sum();

}

public class B implements A {

	public static void main(String[] args) {
		B b=new B();
		b.sum();

	}

	@Override
	public void sum() {
		int sum = j + k;
		System.out.println(sum);

	}

}
