package com.santhosh.Multithreading;
//Two ways to use Threads on class level are below

//Extends Thread
//Implements Runnable

class Task1 extends Thread {
	public void run() {// SIGNATURE
		System.out.println("Task 1 Started");
		// Task 1
		for (int i = 100; i <= 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task 1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task 2 Started");
		// Task 1
		for (int i = 200; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task 2 Done");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

		Task1 task1 = new Task1();
		task1.setPriority(1);// Set Priority is a request, it might not be honored at some cases
		task1.start();// Shouldn't be task1.run(), Should be task1.start() for Parallel tasking.

		// Task 2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task1 to complete
		task1.join();
		task2Thread.join();

		// Task 3
		System.out.println("Task 3 Initiated");
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task 3 Done");

		// Task 4
		for (int i = 400; i <= 499; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task 4 Done");

		System.out.println("Tasks completed");
	}

}
//Thread.yeild();//Request to giveUp CPU
//Thread.sleep();//Sleep for Some time
//When you put Synchronized keyword, only one Thread can execute code on that Instance. other thread needs to wait