package com.java.abstracts;

interface Shape {
	int length = 10;
	int width = 20;

	void circe();

	default void square() {
		System.out.println("This Square default");
	}

	static void rectangle() {
		System.out.println("This Rectangle static");
	}

	public class InterfaceDemo implements Shape {
		static void triangle() {
			System.out.println("This triangle static");
		}
		public static void main(String[] args) {
			InterfaceDemo demo = new InterfaceDemo();
			demo.circe();
			demo.square();
			Shape.rectangle();
			
			Shape shape=new InterfaceDemo();
			shape.circe();
			shape.square();
			Shape.rectangle();
			

		}

		@Override
		public void circe() {
			System.out.println("This Square default");

		}

	}
}