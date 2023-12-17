package com.java.statickeyword;

public class StaticExample {
	static int a = 10;// static variable
	int b = 20;// non static variable

	static void method1() {
		StaticExample staticExample = new StaticExample();
		System.out.println(staticExample.a);
		System.out.println("This is method1 static method");
	}

	void method2() {
		System.out.println("This is method2 is non static method");
	}

	void method3() {
		System.out.println("---This si method 3 Non Static Method---");
		System.out.println(a);
		System.out.println(b);
		method1();
		method2();
	}

	public static void main(String[] args) {
		// 1.static methods can access only static stuff (directly).
		System.out.println(a);
		StaticExample.method1();

		// System.out.println(b);//Its Non Static method
		// method2(); //Its Non Static method

		// 2.static methods can also access non static stuff but through object.
		StaticExample staticExample = new StaticExample();
		System.out.println(staticExample.b);// Non static variable through object
		staticExample.method2(); // Non static variable through object
		staticExample.method3();

	}

}
