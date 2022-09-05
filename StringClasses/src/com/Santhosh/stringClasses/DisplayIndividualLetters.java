package com.Santhosh.stringClasses;

public class DisplayIndividualLetters {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Type text as your own: ");
		// String something = scanner.next();
		String something = "Hello World";// trail and error here
		int lastValue = something.length();
		// do {
		// System.out.println(something.substring(indexValue, (indexValue + 1)));
		// indexValue++;
		// } while (indexValue < lastValue);
		// for (int i = 0; i <= lastValue; i++) {// Pyramid Printing code
		// System.out.println(something.substring(0, (i + 1)));
		// }
		for (int i = 0; i <= lastValue; i++) {
			System.out.println(something.charAt(i));
		}
	}
}
