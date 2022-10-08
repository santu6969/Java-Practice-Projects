package com.santhosh.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList(); // Useful for more reads and less writes

		// Threads 3
		list.add("Apple");
		list.add("Bat");
		list.add("Cat");
		list.add("Dog");

		// Threads 10000
		for (String element : list) {
			System.out.println(element);
		}
	}

}
//Add - is a costlier operation so useful for lesser add executions
//get - Every time when it has to print/get it will copy the entire array and execute
//So, Thread safe, no synchronizing delay, faster outputs
