package com.java.java.assignment;

import java.util.Scanner;

public class TakingInputFromKeyBoard {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		System.out.println("Given Number is"+num);
		
		System.out.println("Enter Decimal Number");
		double numDouble=scanner.nextDouble();
		System.out.println("Given Number is"+numDouble);
		
		String city=scanner.next();
		System.out.println("Enter City"+city);

	}

}
