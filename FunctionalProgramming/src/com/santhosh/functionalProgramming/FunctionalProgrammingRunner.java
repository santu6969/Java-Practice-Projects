package com.santhosh.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		printBasic(list);
		printWithFP(list);
		printBasicWithFiltering(list);
		printWithFPFiltering(list);
	}

	private static void printBasic(List<String> list) {

		for (String word : list) {
			System.out.println(word);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {

		for (String word : list) {
			if (word.contains("at") == true) {
				System.out.println(word);
			}
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("Element - " + element));
	}

	private static void printWithFPFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("Filtered Element - " + element));
		// filter is a intermediate operations and forEach is Terminal Operations
	}
}
