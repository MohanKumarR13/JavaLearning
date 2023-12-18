package com.java.interfaces;

class A1 {
	void method1() {
		System.out.println("This is method1 A1 class");
	}
}

interface B1 {
	void method2();
}

interface B2 {
	void method3();
}

public class HybridInheritanceExample extends A1 implements B1, B2 {

	public void method2() {
		System.out.println("method 2 from B1 interface");
	}

	public void method3() {
		System.out.println("method 3 from B2 interface");
	}

	public static void main(String[] args) {
		HybridInheritanceExample example = new HybridInheritanceExample();
		example.method1();
		example.method2();
		example.method3();

	}

}
