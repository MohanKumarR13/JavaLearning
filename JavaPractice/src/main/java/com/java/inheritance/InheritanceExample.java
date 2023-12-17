package com.java.inheritance;

class A {// Parent Class
	int a;

	void display() {
		System.out.println(a);
	}
}

class B extends A {// Child Class
	int b;

	void print() {
		System.out.println(b);
	}
}

class C extends B {
	int c;

	void show() {
		System.out.println(c);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		A aObj = new A();
		aObj.a = 100;
		aObj.display();

		B bObj = new B();
		bObj.a = 120;
		bObj.b = 220;
		bObj.display();
		bObj.print();

		C cObj = new C();
		cObj.a = 75;
		cObj.b = 75;
		cObj.c = 100;
		cObj.display();
		cObj.print();
		cObj.show();
	}

}
