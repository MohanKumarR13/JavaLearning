package com.java.oops;

public class StudentMain {

	public static void main(String[] args) {
		
	/*	// Assign Values By using reference variable
		Student student = new Student();
		student.sid = 3243;
		student.sName = "Jackie";
		student.grade = 'A'; */
		
		// By using constructor
		Student student = new Student(3243, "Jackie", 'A');
		student.sid = 3243;
		student.sName = "Jackie";
		student.grade = 'A';
		// By using method
		student.getValues(3243, "Jackie", 'A');
		student.display();
	}

}
