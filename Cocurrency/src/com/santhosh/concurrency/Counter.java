package com.santhosh.concurrency;

public class Counter {
	private int i = 0;

	synchronized public void increment() {
		i = getI() + 1;
		// get value
		// increment
		// set value
	}

	public int getI() {
		return i;
	}

	public String toString() {
		return "Value is " + i;
	}
}
