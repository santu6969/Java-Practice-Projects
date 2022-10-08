package com.santhosh.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	Task(int number) {
		this.number = number;
	}

	public void run() {// SIGNATURE for Thread
		System.out.print("\nTask " + number + " Started\n");
		// Task 1
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask " + number + " Done\n");
	}
}

public class ExectutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8));
		executorService.execute(new Task(9));

		// executorService.execute(new Thread(new Task2()));

		/*
		 * // Task 3 System.out.println("Task 3 Initiated"); for (int i = 300; i <= 399;
		 * i++) { System.out.print(i + " "); } System.out.println("Task 3 Done");
		 * 
		 * // Task 4 for (int i = 400; i <= 499; i++) { System.out.print(i + " "); }
		 * System.out.println("Task 4 Done");
		 * 
		 * System.out.println("Tasks completed");
		 */
		executorService.shutdown();
	}

}
