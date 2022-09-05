package com.Santhosh.Conditionals;

import java.util.Scanner;

public class IfTrailSwitchRunner {

	public static void main(String[] args) {
		int number1;
		int number2;
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1");
		number1 = scanner.nextInt();

		System.out.println("Enter number2 ");
		number2 = scanner.nextInt();
		System.out.println("choices available are\n1  - Addition\n2  - Subtraction\n3  - Multiply\n4  -  Division");
		System.out.println("Enter your choice: ");
		choice = scanner.nextInt();

		IfTrail conditions = new IfTrail(number1, number2, choice);
		conditions.trail1();
	}

}
