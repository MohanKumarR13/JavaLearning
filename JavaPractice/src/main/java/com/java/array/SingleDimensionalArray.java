package com.java.array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int a[] = new int[5]; // Declare Array with size 5,Starting index is 0 and last index is 4
		// Storing/Inserting values into array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		int b[] = { 100, 200, 300, 400, 500 }; // Declaring the Array without specifies size
		System.out.println("a length : " + a.length + " b length : " + b.length); // Prints length/size of an array"
		System.out.println("Get the Index Of 2 " + a[2]);// Reading the Specific Value

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Array Elements  " + a[i]);

		}

		// Read values using enhanced for loop
		for (int i : a) {
			System.out.println("Array Elements " + i);
		}

	}

}
