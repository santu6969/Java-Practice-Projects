package com.santhosh.generics;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
	ArrayList<T> list = new ArrayList<>();// <T> indicates type, we can use any character that we want here

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public String toString() {
		return String.format("List" + list);
	}

	public T get(int i) {

		return list.get(i);
	}
}
