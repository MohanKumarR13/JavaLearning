package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// Declaration
		// HashMap<K, V>hs=new HashMap<K, V>();
		HashMap<Integer, String> hs2 = new HashMap<Integer, String>();
		// Adding Pairs into HashMap
		hs2.put(101, "John");
		hs2.put(102, "Scott");
		hs2.put(103, "David");
		hs2.put(104, "Smith");
		hs2.put(105, "Clark");

		System.out.println(hs2);
		hs2.remove(102);
		System.out.println(hs2);
		// Reading Pairs using for loop
		for (Map.Entry m : hs2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
