package com.set.hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashSetExample {

	public static void main(String[] args) {
		// Declaration
		HashSet hs2 = new HashSet();
		// Adding Pairs into HashMap
		hs2.add("John");
		hs2.add("Scott");
		hs2.add("David");
		hs2.add("Smith");
		hs2.add("Clark");
		hs2.add(null);
		hs2.add(null);
		System.out.println(hs2);
		hs2.remove(102);
		System.out.println(hs2.size());
		// Reading Pairs using for loop

		// Insertion and Access specific element is not possible

		// Convert into Arraylist
		ArrayList al = new ArrayList(hs2);
		System.out.println(al.get(4));
		for (Object obj : hs2) {
			System.out.println(obj);
		}
		hs2.clear();
		System.out.println(hs2);

	}

}
