package com.santhosh.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is a awesome class. This was never happened before.";

		Map<Character, Integer> occurances = new HashMap<>();
		char[] chars = str.toCharArray();
		for (char eachChar : chars) {
			Integer integer = occurances.get(eachChar);
			if (integer == null) {
				occurances.put(eachChar, 1);

			} else {
				occurances.put(eachChar, integer + 1);
			}
		}
		System.out.println(occurances);

		Map<String, Integer> StringOccurances = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			Integer integer = StringOccurances.get(word);
			if (integer == null) {
				StringOccurances.put(word, 1);

			} else {
				StringOccurances.put(word, integer + 1);
			}
		}
		System.out.println(StringOccurances);

	}

}
