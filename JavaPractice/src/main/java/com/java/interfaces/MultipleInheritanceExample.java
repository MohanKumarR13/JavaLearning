package com.java.interfaces;

interface ABC {
	int z = 100;

	void method1();
}

interface XYZ {
	int y = 200;

	void method2();
}

public class MultipleInheritanceExample implements ABC, XYZ {
	public void method1() {
		System.out.println(z);
	}

	public void method2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		MultipleInheritanceExample example = new MultipleInheritanceExample();
		example.method1();
		example.method2();
	}

}
