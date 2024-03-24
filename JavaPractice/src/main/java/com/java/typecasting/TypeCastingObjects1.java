package com.java.typecasting;

class Parent {
	String name = "John";

	void m1() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	int i = 150;

	void m2() {
		System.out.println("Child");
	}

	public class TypeCastingObjects1 {

		public static void main(String[] args) {
			Child child = new Child();
			System.out.println(child.name);
			child.m1();
			System.out.println(child.i);
			child.m2();

			Parent parent = new Child(); // Upcast
			System.out.println(parent.name);
			parent.m1();
			/*
			 * System.out.println(parent.i); parent.m2(); //We cannot access
			 */
			Parent parent2 = new Parent();
			Child child2 = (Child) parent2;
			System.out.println(child2.name);
			System.out.println(child2.i);
			child2.m1();
			child.m2();
		}
	}
}
