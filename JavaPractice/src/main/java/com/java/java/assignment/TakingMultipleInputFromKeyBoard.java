package com.java.java.assignment;

import java.util.Scanner;

public class TakingMultipleInputFromKeyBoard {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num=scanner.nextInt();
		System.out.println("Given Number is"+num);
		
		System.out.println("Enter Second Number");
		double numDouble=scanner.nextDouble();
		System.out.println("Given Number is"+numDouble);
		
		System.out.println("Addition"+(num+numDouble));
		
		System.out.println("Enter Name");
		String name=scanner.next();
		System.out.println("Your name is"+name);
		
		System.out.println("Enter Age");
		int age=scanner.nextInt();
		System.out.println("Your name is"+age);
		
		System.out.println("Enter Unknown value");
		Object value=scanner.next();
		System.out.println(value);
		
		

	}

}
