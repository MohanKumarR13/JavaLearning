package com.java.java.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class GreatestOfThrreeNumbers {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(a);
		arrayList.add(b);
		arrayList.add(c);

		// Printing the largest number
		System.out.println(Collections.max(arrayList) + " is the largest number.");
	}
}