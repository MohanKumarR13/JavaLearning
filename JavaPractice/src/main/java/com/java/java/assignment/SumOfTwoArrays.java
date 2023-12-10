package com.java.java.assignment;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int[] array1 = { 2, 2, 7 };
		int[] array2 = { 8, 8, 3 };
		int[] sumArray = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			sumArray[i] = array1[i] + array2[i];
		}
		System.out.print("Sum Array: ");
		for (int num : sumArray) {
			System.out.print(num + " ");
		}
	}
}