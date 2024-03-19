package com.java.interview;

public class SumOfArray {
	 public static void main(String[] args) {  
	        //Initialize array  
	        int [] a =  {1, 2, 3, 4, 5};  
	        int s = 0;  
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < a.length; i++) {  
	           s = s+ a[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + s);  
	    }  

}
