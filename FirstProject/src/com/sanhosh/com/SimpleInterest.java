package com.sanhosh.com;

import java.math.BigDecimal;

public class SimpleInterest {
	BigDecimal principal;
	BigDecimal RateOfInterest;
	BigDecimal noOfYears;
	BigDecimal totalSum;

	SimpleInterest(String principal, String RateOfInterest) {
		this.principal = new BigDecimal(principal);
		this.RateOfInterest = new BigDecimal(RateOfInterest);

	}

	SimpleInterest() {
		this.principal = new BigDecimal("1000");
		this.RateOfInterest = new BigDecimal("6");
		// System.out.println("Default Principal and Rate of Interests are 1000 and 6
		// respectively");
	}

	public BigDecimal calculator(String noOfYears) {
		this.noOfYears = new BigDecimal(noOfYears);
		BigDecimal totalSum = principal
				.add((principal.multiply(RateOfInterest).multiply(this.noOfYears).divide(new BigDecimal("100"))));
		this.totalSum = totalSum;
		return this.totalSum;
	}

	public BigDecimal calculator() {
		noOfYears = new BigDecimal("1");
		// System.out.println("Default interest calculate for 1 year");
		BigDecimal totalSum = principal
				.add((principal.multiply(RateOfInterest).multiply(noOfYears).divide(new BigDecimal("100"))));
		this.totalSum = totalSum;
		return this.totalSum;
	}
}
