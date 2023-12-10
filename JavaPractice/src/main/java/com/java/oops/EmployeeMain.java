package com.java.oops;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.eid = 123;
		employee.eName = "Jack";
		employee.salary = 13000.00;
		employee.deptNo = 932;
		employee.job = "Helper";
		employee.display();

		Employee employee2 = new Employee();
		employee2.eid = 113;
		employee2.eName = "Jackie";
		employee2.salary = 14000.00;
		employee2.deptNo = 942;
		employee2.job = "Mason";
		employee2.display();
	}
}
