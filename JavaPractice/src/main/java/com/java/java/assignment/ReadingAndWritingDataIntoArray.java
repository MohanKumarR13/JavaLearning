package com.java.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<a.length;i++) {
			System.out.println("Enter Value");
			a[i]=scanner.nextInt();
		}
		System.out.println("Printing Array Elements");
		
		System.out.println(Arrays.toString(a));

	}

}
