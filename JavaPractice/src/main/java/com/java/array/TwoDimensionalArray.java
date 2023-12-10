package com.java.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		int b[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		System.out.println("Number Of Columns " + b[0].length);
		System.out.println("Number Of Rows " + b.length);

		for (int i = 0; i < b.length; i++) {// outter loop
			for (int j = 0; j < b[i].length; j++) { // inner loop
				System.out.println(b[i][j]);
			}
		}
		// Enhanced For Loop
		for (int r[] : b) {
			for (int i : r) {
				System.out.println(i);
			}
		}

	}

}
