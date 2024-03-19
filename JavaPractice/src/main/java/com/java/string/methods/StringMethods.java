package com.java.string.methods;

import java.util.Arrays;

public class StringMethods {
	public static void lengthOfString() {
		String s = "Welcome";
		System.out.println("Length Of " + s.length());
	}

	public static void stringConcat() {
		String s = "Welcome";
		String s1 = "Java";
		String s2 = "Automation";
		System.out.println("Cancat Of String " + s.concat(s1));
		System.out.println(s1 + s2);
		System.out.println(s + s1 + s2);
		System.out.println(s1.concat(s2).concat(s));
		System.out.println(s.concat(s1 + s2));
	}

	public static void stringTrim() {
		String s = "    Welcome    ";
		System.out.println("Before Of String Trim " + s);
		System.out.println("After Of String Trim " + s.trim().length());

	}

	public static void stringCharAt() {
		String s = "Welcome";
		System.out.println("CharAt Of " + s.charAt(3));

	}

	public static void stringContains() {
		String s = "Welcome";
		System.out.println("Contains Of " + s.contains("W"));
		System.out.println("Contains Of " + s.contains("w"));

	}

	public static void stringEquals() {
		String s = "Welcome";
		String s1 = "Welcome";

		System.out.println("Equals " + s.equals(s1));
		System.out.println("Equals " + s.equals("Wel Come"));
		System.out.println("Equals " + s.equals("welcome"));

	}

	public static void stringEqualsIgnoreCase() {
		String s = "Welcome";
		String s1 = "Welcome";

		System.out.println("EqualsIgnoreCase " + s.equalsIgnoreCase(s1));
		System.out.println("EqualsIgnoreCase " + s.equalsIgnoreCase("Wel Come"));
		System.out.println("EqualsIgnoreCase " + s.equalsIgnoreCase("welcome"));

	}

	public static void stringReplaceCharacter() {
		String s = "Welcome To Java";
		System.out.println("Before Replacing " + s);

		System.out.println("After Replacing " + s.replace('o', 'w'));
		System.out.println("After Replacing " + s.replace("Java", "Selenium"));

	}

	public static void subString() {
		String s = "Welcome To Java";
		System.out.println(s.substring(0, 4));

	}

	public static void stringToLowerCase() {
		String s = "WELCOME TO JAVA";
		System.out.println(s.toLowerCase());

	}

	public static void stringToUpperCase() {
		String s1 = "welcome to java";

		System.out.println(s1.toUpperCase());

	}

	public static void main(String[] args) {
		lengthOfString();
		stringConcat();
		stringTrim();
		stringCharAt();
		stringContains();
		stringEquals();
		stringEqualsIgnoreCase();
		stringReplaceCharacter();
		subString();
		stringToLowerCase();
		stringToUpperCase();

		String mail = "abc@gmail.com";
		String a[] = mail.split("@");
		System.out.println(Arrays.toString(a));

		System.out.println(a[0]);
		System.out.println(a[1]);

		String amt = "$13,34,55";
		System.out.println(amt.replace("$", ""));
		System.out.println(amt.replace("$", "").replace("", ""));

		mail = "abc,123@xyz";

		String arr1[] = mail.split(",");
		System.out.println(Arrays.toString(arr1));
		String arr2[] = mail.split("@");
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1[1]);
		System.out.println(arr2[1]);

		String w = "abc 123 zyz";
		String ar[] = w.split(" ");
		System.out.println(Arrays.toString(ar));

		String name = "Mohan Kumar";
		Object h = name.replace('m', 'M').contains("Kumar");
		System.out.println(h);
		System.out.println(name.toLowerCase().contains("Kumar"));
		split();
	}
	
	public static void split() {
		String str="Selenium,Java,TestNG,Maven";
		String ar[] = str.split(",");
		System.out.println("Split"+Arrays.toString(ar));
		
	      for (String a : ar)
	            System.out.println(a);
	    }
	}

