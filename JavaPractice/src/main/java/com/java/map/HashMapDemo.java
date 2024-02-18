package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "John");
		hashMap.put(102, "David");
		hashMap.put(103, "Scott");
		hashMap.put(104, "Mary");
		hashMap.put(105, "Tye");
		hashMap.put(103, "X");
		hashMap.put(106, "David");
		System.out.println(hashMap);
		System.out.println(hashMap.get(105)); // Tye
		hashMap.remove(106); // Remove pair of hashmap
		System.out.println(hashMap);
		System.out.println(hashMap.containsKey(101)); // true
		System.out.println(hashMap.containsKey(106)); // false
		System.out.println(hashMap.containsValue("Mary")); // true
		System.out.println(hashMap.containsValue("JK")); // false
		System.out.println(hashMap.isEmpty()); // false
		System.out.println(hashMap.keySet()); // returns all the keys as set
		for (Object object : hashMap.keySet()) {
			System.out.println(object);
		}
		System.out.println(hashMap.values()); // returns all the keys as collections
		for (Object object : hashMap.values()) {
			System.out.println(object);
		}

		for (Object object : hashMap.keySet()) {
			System.out.println(object + "  " + hashMap.get(object));
		}

		System.out.println(hashMap.entrySet()); // returns all the entries as set
		for (Object object : hashMap.entrySet()) {
			System.out.println(object);
		}
		// Entry Methods
		for (Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		// iterator()
		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}

}
