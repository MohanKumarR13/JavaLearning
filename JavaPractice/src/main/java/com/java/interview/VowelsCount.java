package com.java.interview;

public class VowelsCount {

	public static void main(String[] args) {
		String str = "settle down";
		int count = 0;
		for (char c : str.toCharArray()) {
			c = Character.toLowerCase(c);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
			System.out.println(count);
		}

	}

}
