package com.java.inheritance;

class Parent {
	int a;

	void display() {
		System.out.println(a);
	}
}

class Child1 extends Parent {
	int x;

	void show() {
		System.out.println(x);
	}
}

class Child2 extends Parent {
	int y;

	void print() {
		System.out.println(y);
	}
}

class Child3 extends Parent {
	int z;

	void d() {
		System.out.println(z);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.a = 23;
		child1.x = 27;
		child1.display();
		child1.show();

		Child2 child2 = new Child2();
		child2.a = 45;
		child2.y = 5;
		child2.display();
		child2.print();
	}

}
