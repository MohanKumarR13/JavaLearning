package com.java.interfaces;

interface A {
	int a = 10; // By Default Variables in Interface are static and final

	void method1();// its an abstract method and by default public
}

public class Test implements A {

	public void method1() {
		System.out.println(a);

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.method1();

		A a = new Test();
		a.method1();

	}

}
