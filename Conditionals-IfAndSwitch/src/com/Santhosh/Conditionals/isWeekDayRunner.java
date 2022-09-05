package com.Santhosh.Conditionals;

import java.util.Scanner;

public class isWeekDayRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dayNumber: ");
		int dayNumber = scanner.nextInt();

		System.out.println("WeekDay is " + isWeekDay(dayNumber));
		System.out.println("Enter the no of month: ");
		int noOfMonth = scanner.nextInt();
		System.out.printf("The Month is " + nameOfTheMonth(noOfMonth)).println();
		System.out.printf("The Day is " + determineNameOfTheDay(dayNumber)).println();
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
		case 6:
		default:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}
	}

	public static String nameOfTheMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "Febraury";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid Option";
		}

	}

	public static String determineNameOfTheDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 0:
			return "Suday";
		default:
			return "Invalid Option";
		}
	}
}