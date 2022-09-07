package com.Santhosh.Arrays;

public class daysOfTheWeek {
	String[] allDays;

	public daysOfTheWeek(String... allDays) {
		this.allDays = allDays;
	}

	public void allDays() {
		for (String print : this.allDays) {
			System.out.println(print);
		}
	}

	public String longestString() {
		String longestString = "";
		for (String day : this.allDays) {
			if (longestString.length() <= day.length()) {
				longestString = day;
			}
		}
		return longestString;
	}

	public void allDaysReverse() {
		int length = this.allDays.length - 1;
		for (int i = length; i >= 0; i--) {
			System.out.println(allDays[i]);
		}
	}

}
