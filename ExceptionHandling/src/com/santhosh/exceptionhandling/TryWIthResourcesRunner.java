package com.santhosh.exceptionhandling;

import java.util.Scanner;

public class TryWIthResourcesRunner {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 1, 2, 3, 45 };
			int number = numbers[5];
		}
	}

}