package com.santhosh.functionalProgramming;

import java.util.List;

public class MethodReferencesRunner {

	static void print(Integer number) {
		System.out.println(number);
	}

	static boolean findEvenNumber(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		int maxEvenNumber = List.of(12, 32, 33, 54, 65, 73, 62).stream().filter(MethodReferencesRunner::findEvenNumber)
				.max(Integer::compare).orElse(0);
		System.out.println(maxEvenNumber);
	}

}
