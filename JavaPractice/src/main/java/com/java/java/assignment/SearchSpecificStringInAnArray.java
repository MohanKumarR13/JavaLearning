package com.java.java.assignment;

public class SearchSpecificStringInAnArray {
	public static void main(String[] args) {
		String[] arr = { "Apple", "Banana", "Orange" };
		String key = "Banana";
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Available at index " + i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Not found");
		}
	}
}
