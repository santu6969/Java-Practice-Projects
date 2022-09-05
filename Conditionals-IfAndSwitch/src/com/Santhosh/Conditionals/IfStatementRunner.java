package com.Santhosh.Conditionals;

public class IfStatementRunner {

	public static void main(String[] args) {
		// int i = 25;

		// if (i == 25) {
		// System.out.println("i is 25");
		// } else if (i == 26) {
		// System.out.println("i is 26");
		// } else {
		// System.out.println("i is not 25 and 26");
		// }
		puzzle1();
		// puzzle2(); //bad code
		// puzzle3(); // bad code
		puzzle4();

	}

	private static void puzzle1() {
		int k = 15;
		if (k < 30) {
			System.out.println("k less than 30");
		} else if (k > 30) {
			System.out.println("k greater than 30");
		}
	}

	private static void puzzle2() {
		int l = 16;
		if (l < 20) {
			System.out.println("l is lesser than 20");
		}
		if (l > 20) {// not using else if is not a good practice, see the result
			System.out.println("l is greater than 20");
		} else {
			System.out.println("who am i??");
		}
	}

	private static void puzzle3() {
		int m = 18;
		if (m < 20)
			if (m > 20)// Using {} makes more clarity
				System.out.println("m is less than 20");
			else
				System.out.println("Who am i?");
	}

	private static void puzzle4() {
		int number = 5;
		if (number < 0)
			number = number + 10;// if statement works upto here only
		number++;// not under if statement, so executing seperately
		System.out.println(number);
	}
}
