package com.java.java.assignment;

public class Student {
	int SID;
	String sName;
	String sub1;
	String sub2;
	String sub3;

	void getStudentData(int SID, String sName) {
		System.out.println(SID = SID);
		System.out.println(sName = sName);
	}

	void getStudentSubjects() {
		Student student = new Student();
		System.out.println(student.sub1 = "Maths");
		System.out.println(student.sub2 = "English");
		System.out.println(student.sub3 = "Biology");
	}

	void getStudentTotalMarks(int a, int b, int c) {
		Student student = new Student();

		System.out.println(student.sub1 = "Maths " + a);
		System.out.println(student.sub2 = "English " + b);
		System.out.println(student.sub3 = "Biology " + c);
		int toatlMarks = a + b + c;
		System.out.println("Total Marks " + toatlMarks);
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.SID = 121);
		System.out.println(student.sName = "Loki");
		student.getStudentData(101, "Thor");
		student.getStudentSubjects();
		student.getStudentTotalMarks(54, 56, 67);

		Student student2 = new Student();
		student2.getStudentData(32, "Mark");
		student2.getStudentTotalMarks(35, 56, 56);

	}
}
