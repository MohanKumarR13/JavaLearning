package com.java.interview;

public class CountEvenAndOddNumbers {
	static int []n= {11,2,3,4,56};
	 public static void main(String[] args) {
	        int e = 0, o = 0;
	     
	       
	        for (int element : n) {
	            if (element % 2 == 0) {
	                e++;
	            } else {
	                o++;
	            }
	        }
	        System.out.println("Total Even Nos : " + e);
	        System.out.println("Total Odd Nos  : " + o);
	    }
	 }
	

