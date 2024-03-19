package com.java.dataconversion;

public class DataConversionMethods {

	public static void main(String[] args) {
		String s="welcome"; //Cannot convert into int
		String s1="10";
		String s2="100";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		//String->Double
		String s3="10.7";
		String s4="20.5";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		//String->Boolean
		String str="true";
		System.out.println(Boolean.parseBoolean(str));
		//String -->Char is not possible
		//int,double,boolean,char-->String
		int a=10;
		double d=10.5;
		char ch='A';
		boolean b=true;
		
		String st=String.valueOf(a);
		System.out.println(a);
		st=String.valueOf(d);
		System.out.println(st);


		


	}

}
