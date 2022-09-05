package com.santhosh.loops;

import java.util.Scanner;

public class DoWhileExcercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		int number1 = 0;
		int number2 = 0;

		do {
			System.out.println("Enter number1 : ");
			number1 = scanner.nextInt();
			System.out.println("Enter number2 : ");
			number2 = scanner.nextInt();
			System.out.println("Options\n1  -  Add\n2  -  Subtract\n3  -  Divide\n4  -  Multiply\n5  -  Exit");
			System.out.println("Enter your Option : ");
			option = scanner.nextInt();
			System.out.printf("your choosen values are \nnumber1 is %d\nnumber2 is %d\nOption is %d", number1, number2,
					option).println();
			switch (option) {
			case 1:
				System.out.println("Sum of two numbers is : " + (number1 + number2));
				break;
			case 2:
				System.out.println("Subtraction of two numbers is : " + (number1 - number2));
				break;
			case 3:
				System.out.println("Division of two numbers is : " + (number1 / number2));
				break;
			case 4:
				System.out.println("Multiplication of two numbers is : " + (number1 * number2));
				break;
			case 5:
				System.out.println("Exiting!!!\nThank You!, Have a Nice Day");
				break;
			default:
				System.out.println("Invalid Option");
			}
		} while (option < 5);
	}

}
