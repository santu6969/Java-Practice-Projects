package com.santhosh.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 12, 32, 4, 65, 89);
		List<String> words = List.of("Apple", "Bat", "Cat", "Dog", "Elephant");

		/*
		 * int sum = numbers.stream().reduce(0, (number1, number2) -> number1 +
		 * number2); System.out.println(sum);
		 * 
		 * int sumOfOddNumbers = numbers.stream().filter(element -> element % 2 ==
		 * 1).reduce(0, (number1, number2) -> number1 + number2);
		 * System.out.println(sumOfOddNumbers);
		 * 
		 * int sumOfEvenNumbers = numbers.stream().filter(element -> element % 2 ==
		 * 0).reduce(0, (number1, number2) -> number1 + number2);
		 * System.out.println(sumOfEvenNumbers);
		 */
		System.out.println(normalSum(numbers));
		System.out.println(FPSum(numbers));
		printFirstFiveNumbers(numbers);
		printLowerCaseWords(words);
		printTheLengthOfString(words);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
	}

	private static int FPSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}

	static void printFirstFiveNumbers(List<Integer> numbers) {
		numbers.stream().sorted().distinct().limit(5).forEach(e -> System.out.println(e));
		IntStream.range(1, 11).forEach(e -> System.out.println(e));
	}

	static void printLowerCaseWords(List<String> list) {
		list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
	}

	static void printTheLengthOfString(List<String> list) {
		list.stream().map(e -> e.length()).forEach(p -> System.out.println("elementLength - " + p));
	}
}
