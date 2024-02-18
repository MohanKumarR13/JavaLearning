package com.java.oops;

public class Student {
	int sid;
	String sName;
	char grade;

	Student(int sid, String sName, char grade) {//Constructor 
		System.out.println(sid = sid);
		System.out.println(sName = sName);
		System.out.println(grade = grade);

	}

	void display() {
		System.out.println(sid + " " + sName + " " + grade);
	}

	void getValues(int sid, String sName, char grade) {//Method
		System.out.println(sid = sid);
		System.out.println(sName = sName);
		System.out.println(grade = grade);

	}
	
	
}
