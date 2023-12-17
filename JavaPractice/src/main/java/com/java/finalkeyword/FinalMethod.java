package com.java.finalkeyword;

class Bike {
	final void run() { // Final Method we cannot override this is in child class
		System.out.println("Running...");
	}
}

class Honda extends Bike {
//	void run() { //compile time error
	// System.out.println("Started...");
//	}
//}
	public class FinalMethod {

		public static void main(String[] args) {

		}

	}
}
