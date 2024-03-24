package com.java.typecasting;

//Upcasting-- Converting value from smaller-> larger
//int -->long
//float-->double
//Downcasting->converting value from larger-->smaller
//long-->long
//double-->float
public class TypeCastingConcept {

	public static void main(String[] args) {

//Upcasting automatic--smaller to larger
		int intValue = 100;
		long longValue = intValue;
		System.out.println(longValue);

		float fValue = 10.4F;
		double dValue = fValue;

		// downcasting manually-larger to smaller
		long lValue = 10000;
		int iValue = (int) lValue;

		double dValues = 123.32;
		float floatValue = (float) dValues;

		// Example1
		int i = 100;
		double doubleVal = i;// Upcasting
		System.out.println(doubleVal);

		double dd = 10.3;
		int i1 = (int) dd;

	}

}
