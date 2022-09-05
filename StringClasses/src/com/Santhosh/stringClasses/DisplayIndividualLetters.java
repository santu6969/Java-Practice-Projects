package com.Santhosh.stringClasses;

import java.util.Scanner;

public class DisplayIndividualLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type text as your own: ");
		String something = scanner.nextLine();
		int lastValue = something.length();
		int indexValue = 0;
		// for (int i = 0; i <= lastValue; i++) {// Pyramid Printing code
		// System.out.println(something.substring(0, (i + 1)));
		// }
		for (int i = 0; i < lastValue; i++) {
			System.out.println(something.charAt(i));
		}
		// while (indexValue < lastValue) {// using while loop
		// System.out.println(something.substring(indexValue, (indexValue + 1)));
		// indexValue++;
		// }
	}
}
