package com.santhosh.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(6);

		System.out.println("Prime Number is: " + number.isPrime());
		System.out.println("Sum Up to N number is : " + number.sumUptoN());
		System.out.println("Sum of Divisors is : " + number.sumOfDivisors());
		number.printANumberTriAngle();
	}

}
