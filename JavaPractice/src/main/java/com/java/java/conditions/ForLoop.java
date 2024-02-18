package com.java.java.conditions;

public class ForLoop {

	public static void main(String[] args) {
		// Ascending Order
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// Desending Order
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		//Even Numbers
		for (int i = 2; i <=10; i+=2) {
			System.out.println("Even Numbers"+i);
		}
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		}
	}

}
