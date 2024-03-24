package com.java.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		int a[] = { 200, 10, 22, 23, 11 };
		// How to declare ArrayList

		// ArrayList list=new ArrayList(); //We Can store any type of elements

		// ArrayList<String>list=new ArrayList<String>(); //Strings
		// ArrayList<String> lists = new ArrayList<String>(); // String
		ArrayList<Object> lists = new ArrayList<Object>(); // Object

		// Adding vaules to arraylist
		lists.add("John");
		lists.add("David");
		lists.add("Scott");
		lists.add("Smith");
		lists.add(1000);
		lists.add("Harrdy");
		System.out.println(lists);
		// Size Of Array List
		System.out.println(lists.size());
		// Remove an Element
		System.out.println("After Remove Element");
		lists.remove(2);
		System.out.println(lists.size());
		System.out.println(lists);
		// Inserting the new Element
		System.out.println("Inserting New Element");
		lists.add(2, "Clark");
		System.out.println(lists);
		// Read values from arraylist
		for (Object s : lists) { // Object Type Variable can hold any type of variable
			System.out.println(s);
		}
		// Sorting
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting" + Arrays.toString(a));

		// Check array is empty or not
		System.out.println(lists.isEmpty());
//Reverse An array
		int b[] = { 100, 200, 300, 400, 500 };
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.println(b[i]);
		}
		// Modify element
		lists.set(2, 232);
		System.out.println(lists);
		// Access specific element
		System.out.println(lists.get(2));
		// Using normal for loop
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}

		// Using for each loop
		for (Object x : lists) {
			System.out.println(x);
		}

		// Using Iterator
		Iterator iterator = lists.iterator();
		System.out.println(iterator.next());

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ArrayList<Object> list = new ArrayList<Object>(); // Object

		// Adding vaules to arraylist
		list.add("John");
		list.add("David");
		list.add("Scott");
		list.add("Smith");
		list.add(1000);
		list.add("Harrdy");
		System.out.println(list);
		lists.removeAll(list);
		System.out.println(list.isEmpty());
		lists.clear();
		System.out.println(lists.isEmpty());

	}

}
