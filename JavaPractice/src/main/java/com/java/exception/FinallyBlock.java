package com.java.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program Stared");

		int a = 100;
		try {
			System.out.println(a / 0);
		} catch (Exception e) {
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");

		}
		System.out.println("Program Exited");

	}
}