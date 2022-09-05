package com.Santhosh.Conditionals;

public class IfTrail {
	int number1;
	int number2;
	int choice;

	IfTrail(int number1, int number2, int choice) {
		this.number1 = number1;
		this.number2 = number2;
		this.choice = choice;

	}

	void trail1() {

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
