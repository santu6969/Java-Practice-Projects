package com.santhosh.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// Unique -- Set
		// HashSet -- Random Order
		// LinkedHash - Insertion order
		// TreeSet - Sorted Manner
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("Linked Hash Set" + linkedHashSet);

		Set<Character> charactersTreeSet = new TreeSet<>(characters);
		System.out.println("Tree Set" + charactersTreeSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("Hash Set" + hashSet);
	}

}
