package com.java.exception;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		System.out.println("Progress is Started");
		System.out.println("Progress is in Progress");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Progress is Completed");
		System.out.println("Progress is Exited");

	}

}
