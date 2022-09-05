package com.sanhosh.com;

import java.math.BigDecimal;

public class Interestcalculator {
	BigDecimal principle;
	BigDecimal interestRate;
	BigDecimal noOfYears;

	Interestcalculator(String priciple, String interestRate, String noOfYear) {
		this.principle = new BigDecimal(priciple);
		this.interestRate = new BigDecimal(interestRate);
		this.noOfYears = new BigDecimal(noOfYear);

	}

	public BigDecimal calculateInterest() {
		BigDecimal interest = principle.multiply(interestRate).multiply(noOfYears).divide(new BigDecimal("100"));
		return interest;
	}

	public BigDecimal calculateTotal() {
		// BigDecimal interest = new BigDecimal();
		// new BigDecimal(sumo);
		BigDecimal total = principle
				.add((interestRate.multiply(principle).multiply(noOfYears).divide(new BigDecimal("100"))));
		return total;
	}

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
