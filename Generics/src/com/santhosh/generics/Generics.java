package com.santhosh.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generics {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumberList(List<? extends Number> numbers) {// Accept any List that extends number Class
		double sum = 0.0; // Upper bounded wild card
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addValues(List<? super Number> numbers) {
		// Accept any number Class elements in the List
		// Lower bounded wild card
		numbers.add(1);
		numbers.add(1.2);
		numbers.add(1.3f);
		numbers.add(1l);

	}

	public static void main(String[] args) {

		List emptyList = new ArrayList<Integer>();
		addValues(emptyList);
		System.out.println(emptyList);

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5, 6)));
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4.2, 5.3, 6.4)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l, 6l)));

		LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);

		MyCustomList<Long> list = new MyCustomList<>();
		list.addElement(5l);
		list.addElement(6l);
		long value = list.get(0);
		System.out.println(value);
		System.out.println(list);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(1);
		list2.addElement(2);
		list2.removeElement(1);
		list2.addElement(4);
		Integer value2 = list2.get(0);
		System.out.println(value2);
		System.out.println(list2);

	}

}
