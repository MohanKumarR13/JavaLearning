package com.java.java.assignment;

//Inheritance Concept
class ComputerTeacher extends Teacher {
	void does() {
		System.out.println("Teaching...");
	}
}

public class Teacher {
	String designation = "Teacher";
	String collegeName = "ABC College";

	void does() {
		System.out.println(designation);
		System.out.println(collegeName);
		System.out.println("Teaching...");
	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.does();

	}

}
