package com.java.string.methods;

public class ReverseAString {

	public static void main(String[] args) {
		String s="Selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is"+rev);

		
		String s1="Selenium";
		String rev1="";
		char a[]=s1.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev1=rev1+a[i];
		}
		System.out.println("Reverse String is"+rev1);
		
		StringBuffer buffer=new StringBuffer("Java");
		System.out.println("Reverse a string"+buffer.reverse());
		
		StringBuilder builder=new StringBuilder("Java");
		System.out.println("Reverse a string"+builder.reverse());
		
		


	}

}
