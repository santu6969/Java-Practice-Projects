package com.Santhosh.Conditionals;

import java.util.Scanner;

public class IfTrailRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = scanner.nextInt();

		System.out.println("Enter Number2: ");
		int number2 = scanner.nextInt();

		System.out.println("The choices you have ");
		System.out.println("Option 1  -  Add");
		System.out.println("Option 2  -  Subtract");
		System.out.println("Option 3  -  Mutliply");
		System.out.println("Option 4  -  Divide");

		System.out.println("Enter the Choice of yours  ");
		int choice = scanner.nextInt();

		System.out.println("The Numbers and choices you picked are ");
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
		System.out.println("The Choice is  " + choice);

		extracted(number1, number2, choice);
		// IfTrail.trail1(number1, number2, choice);
	}

	private static void extracted(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("The addition of two numbers is " + (number1 + number2));
			break;
		case 2:
			System.out.println("The difference between two numbers is " + (number1 - number2));
			break;
		case 3:
			System.out.println("The Multiplication of two numbers is " + (number1 * number2));
			break;
		case 4:
			System.out.println("The Divided result of two numbers is " + (number1 / number2));
			break;
		default:
			System.out.println("Invalid Option");

		}
	}
}
