package com.java.typecasting;

class Animal {
	String name = "John";

	void m1() {
		System.out.println("Parent");
	}
}

class Dog extends Animal {
	int i = 150;

	void m2() {
		System.out.println("Child");
	}

	class Cat extends Animal {
		int i = 150;

		void m2() {
			System.out.println("Child");
		}

		public class TypeCastingObjects1 {

			public static void main(String[] args) {
				// Conversion is valid or not
				// The Type of Cat or Dog must have some relationship either parent to child or
				// child to parent
				Animal animal = new Dog();
				Cat cat = (Cat) animal;

				Dog dog = new Dog();
				// Cat cat2=(Cat)dog;//Invalid

				// Assignment is valid or not
				// Cat must be either same or child of Animal
				Animal animal2 = new Dog();
				Cat cat2 = (Cat) animal2;// Valid

				Animal animal3 = new Dog();
				// Cat cat3=(Dog)animal3;//Invalid

				// Underlying object type of dog must be either same or child of C;
				Animal animal4=new Dog();
				Cat cat3=(Cat)animal4;//Invalid
				
				Animal animal5=new Dog();
				Dog dog2=(Dog)animal5;
			}
		}
	}
}