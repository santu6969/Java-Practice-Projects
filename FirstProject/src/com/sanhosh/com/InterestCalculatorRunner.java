package com.sanhosh.com;

public class InterestCalculatorRunner {

	public static void main(String[] args) {
		Interestcalculator santhosh = new Interestcalculator("15000", "7.5", "3.5");
		// System.out.println(santhosh.calculateTotal());
		System.out.printf("santhosh interest+total value is %s", santhosh.calculateTotal()).println();
		System.out.printf("santhosh interest value is %s", santhosh.calculateInterest()).println();

		Interestcalculator sravani = new Interestcalculator("80000", "6.5", "5");
		System.out.printf("sravani interest+total value is %s", sravani.calculateTotal()).println();
		System.out.printf("sravani interest value is %s", sravani.calculateInterest()).println();
		// System.out.println(sravani.calculateTotal());
	}

}
