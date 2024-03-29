package com.java.overriding;

class Bank {

	double rateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {

	double rateOfInterest() {
		return 30.56;
	}
}

class ICICI extends Bank {

	double rateOfInterest() {
		return 10.76;
	}
}

class AXIS extends Bank {

	double rateOfInterest() {
		return 3.60;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());

		ICICI icici = new ICICI();
		System.out.println(icici.rateOfInterest());

		AXIS axis = new AXIS();
		System.out.println(axis.rateOfInterest());

	}

}
