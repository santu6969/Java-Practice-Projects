package com.santhosh.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionTrails {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 3, 12, 52, 37, 8, 3, 12, 37, 6));
		/*
		 * printEvenNumbers(numbers); printOddNumbers(numbers);
		 * printSortedNumbers(numbers);
		 * 
		 * printSortedUniqueNumbers(numbers);
		 */
		printSortedUniqueSquareNumbers(numbers);
	}

	static void printEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Even Number " + element));

	}

	static void printOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println("Odd Number " + element));

	}

	static void printSortedNumbers(List<Integer> numbers) {
		numbers.stream().sorted().forEach(e -> System.out.println(e));
	}

	static void printSortedUniqueNumbers(List<Integer> numbers) {
		numbers.stream().distinct().sorted().forEach(e -> System.out.println(e));
	}

	static void printSortedUniqueSquareNumbers(List<Integer> numbers) {
		numbers.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.println(e));
		// numbers.stream().distinct().sorted().forEach(e -> System.out.println(e * e));
	}

}
