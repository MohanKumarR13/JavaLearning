package com.java.finalkeyword;

public class FinalVariable {
	final int speed = 45; // Final Variable so we cannot change the value

	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		/* finalVariable.speed = 5; //Compile Time Error */
		System.out.println(finalVariable.speed);

	}

}
