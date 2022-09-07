package com.Santhosh.Arrays;

public class daysOfTheWeekRunner {
	public static void main(String[] args) {
		daysOfTheWeek print = new daysOfTheWeek(
				new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" });

		print.allDays();

		String longestString = print.longestString();
		System.out.println("Longest string is : " + longestString);

		print.allDaysReverse();
	}
}
