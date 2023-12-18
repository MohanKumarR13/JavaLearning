package com.java.access.specifiers;

class A1 {
	private int data = 10;

	private void method1() {
	}

	int datas = 10;

	void m1() {
		System.out.println(datas);
	}

	protected int i = 200;

	protected void main() {
		System.out.println(i);
	}
}

public class PrivateExample {

	public static void main(String[] args) {
		A1 aObj = new A1();
		// aObj.data=10;//Compile time error
		// aObj.method1();//Compile time error
		aObj.m1();

	}

}
