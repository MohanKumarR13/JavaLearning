package com.java.interview;

public class CountUpperLowerCaseLetters {

	public static void main(String[] args) {
		String str = "Apples";
		int upperCount = 0;
		int lowerCount = 0;
		char[] cha = str.toCharArray();
		for (int i=0;i<str.length();i++) {
			if (cha[i] >= 'A' && cha[i] <= 'Z') {
				upperCount++;
			} else if (cha [i]>= 'a' && cha[i] <= 'z') {
				lowerCount++;
			} else {
				continue;
			}
			System.out.println("Upper case" + upperCount + " " + "Lower case" + lowerCount);
		}

	}

}
