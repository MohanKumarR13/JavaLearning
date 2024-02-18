package com.java.oops;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings greetings=new Greetings();
		greetings.m1();
		String s=greetings.m2();
		System.out.println(s);
		
		greetings.m3("John");
		String var=greetings.m4("David");
		System.out.println(var);

	}

}
