package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// Declaration
		// HashMap<K, V>hs=new HashMap<K, V>();
		HashMap<Object, Object> hs2 = new HashMap<Object, Object>();
		// Adding Pairs into HashMap
		hs2.put(101, "John");
		hs2.put(102, "Scott");
		hs2.put(103, "David");
		hs2.put(104, "Smith");
		hs2.put(105, "Clark");

		System.out.println(hs2);
		hs2.remove(102);
		System.out.println(hs2);
		System.out.println(hs2.keySet());
		System.out.println(hs2.values());
		System.out.println(hs2.entrySet());

		// Reading Pairs using for loop
		for (Map.Entry m : hs2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		// Insertion and Access specific element is not possible

		// Using Iterator
		Iterator<Entry<Object, Object>> iterator = hs2.entrySet().iterator();
		System.out.println(iterator.next());

		while (iterator.hasNext()) {
			Entry<Object, Object> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		hs2.clear();
		System.out.println(hs2);
	}
}
