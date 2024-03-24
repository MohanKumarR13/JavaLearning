package com.java.typecasting;
//A b(C) d
public class TypeCastingObjects3 {

	public static void main(String[] args) {
		Object object = new String("Welcome");
		//StringBuffer buffer = (StringBuffer) object; // R1-pass,R2-Pass,R3-fail

		String object1 = new String("Welcome");
		// StringBuffer buffer1=(StringBuffer)object1; //R1-fail

		Object object2 = new String("Welcome");
		//StringBuffer buffer1 = (StringBuffer) object2; // R1-pass,R2-Pass,R3-fail

		Object object11 = new String("Welcome");
		// StringBuffer buffer11=(String)object11; //R1-pass,R2-fail

		String str = new String("Welcome");
		// StringBuffer buffer11=(String)str; //R1-pass,R2-fail

		Object st = new String("Welcome");
		// StringBuffer buffer11=(String)st; //R1-pass,R2-pass,R3-failed

		Object objec1 = new String("Welcome");
		String buf = (String) objec1; // R1-pass,R2-pass,R3-pass

		System.out.println(buf);

	}

}
