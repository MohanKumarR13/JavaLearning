package com.java.java.assignment;

public class StringMethods {
	public static void lengthOfString() {
		String s = "Welcome";
		System.out.println("Length Of " + s.length());
	}

	public static void stringConcat() {
		String s = "Welcome";
		String s1 = "Java";
		System.out.println("Cancat Of String " + s.concat(s1));
	}

	public static void stringTrim() {
		String s = "    Welcome    ";
		System.out.println("Before Of String Trim " + s);
		System.out.println("After Of String Trim " + s.trim());

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
	}
}
