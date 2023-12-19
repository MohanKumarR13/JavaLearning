package com.java.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
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

	}

}
