package com.java.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		// Hashtable<Object, Object>hashtable=new Hashtable<Object, Object>();//Capacity
		// is 11 and load factor is 0.75
		// Hashtable hashtable2=new (initial capacity)//create hashtable object with
		// soome capacity;
		// Hashtable hashtable2=new HashTable(initial capacity,fill ratio/load factor);

		Hashtable<Integer, String> hashtable3 = new Hashtable<Integer, String>();
		hashtable3.put(101, "John");
		hashtable3.put(102, "David");
		hashtable3.put(103, "Smith");
//	hashtable3.put(104, null); //java.lang.NullPointerException
		System.out.println(hashtable3);
		System.out.println(hashtable3.get(103));
		hashtable3.remove(103);
		System.out.println(hashtable3);
		System.out.println(hashtable3.containsKey(102));
		System.out.println(hashtable3.containsKey(112));

		System.out.println(hashtable3.containsValue("David"));
		System.out.println(hashtable3.containsValue("David R"));
		System.out.println(hashtable3.isEmpty());

		System.out.println(hashtable3.keySet());
		System.out.println(hashtable3.values());

		for (Object object : hashtable3.keySet()) {
			System.out.println(object + " " + hashtable3.get(object));
		}
		// Entry specific methods
		for (Map.Entry entry : hashtable3.entrySet()) { // keys and values
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		// iterator()
		Set set = hashtable3.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
