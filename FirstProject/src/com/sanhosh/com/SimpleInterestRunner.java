package com.sanhosh.com;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleInterest santhosh = new SimpleInterest("60000", "6");
		SimpleInterest sravani = new SimpleInterest();
		SimpleInterest bhavani = new SimpleInterest();

		// System.out.println(santhosh.calculator("6"));
		santhosh.calculator("8");
		sravani.calculator(".25");
		bhavani.calculator();

		System.out.printf("Total amount to be paid by Santhosh is %s", santhosh.totalSum).println();
		System.out.printf("Total amount to be paid by Sravani is %s", sravani.totalSum).println();
		System.out.printf("Total amount to be paid by Bhavani is %s", bhavani.totalSum).println();
		// System.out.println(bhavani.calculator());
	}

}
