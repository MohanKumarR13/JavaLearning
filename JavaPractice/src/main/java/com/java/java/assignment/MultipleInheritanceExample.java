package com.java.java.assignment;

interface ABC {
	int h = 100;
	int t = 2;

	void add();
}

interface XYZ {
	int a = 100;
	int b = 2;

	void multiply();
}

public class MultipleInheritanceExample implements ABC, XYZ {

	public static void main(String[] args) {
		MultipleInheritanceExample example = new MultipleInheritanceExample();
		example.add();
		example.multiply();
	}

	public void multiply() {
		System.out.println(a * b);

	}

	public void add() {
		System.out.println(h + t);

	}

}
