package com.java.string.methods;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// String-Immuatable
		String s = "Welcome";
		s.concat("Java");
		System.out.println(s); // Cannot change original value of s

		// StringBuffer-Muatable
		StringBuffer buffer = new StringBuffer("Java");
		buffer.append("Welcome");
		System.out.println(buffer);// Can we change original value of s
		// StringBuffer-Muatable
		StringBuilder builder = new StringBuilder("Java");
		builder.append("Welcome");
		System.out.println(buffer);// Can we change original value of s

	}

}
