package com.santhosh.loops;

public class MyNumber {
	private int j;
	private int i;
	private int l = 0;

	MyNumber(int j) {
		this.j = j;
	}

	public boolean isPrime() {
		if (j < 2) {// Guard Check
			return false;
		}
		for (i = 2; i <= j; i++) {
			if (j % i == 0) {
				l++;
			}
		}
		if (l == 1) {
			return true;
		}
		return false;
	}

	public int sumUptoN() {
		// return j * (j + 1) / 2;
		int sum = 0;
		for (i = 1; i <= j; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		l = 0;
		for (i = 2; i < j; i++) {
			if (j % i == 0) {
				l = l + i;
			}
		}
		return l;
	}

	public void printANumberTriAngle() {
		for (i = 1; i <= j; i++) {
			System.out.println();
			for (l = 1; l <= i; l++) {
				System.out.print(l + " ");
			}
		}
	}

}
