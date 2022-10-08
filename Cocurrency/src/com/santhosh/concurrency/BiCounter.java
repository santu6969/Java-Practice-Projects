package com.santhosh.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	synchronized public void incrementI() {// Synchronizing
		i = getI() + 1;
		// get value of i
		// increment i
		// set value of i
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() { // Synchronizing
		j = getJ() + 1;
		// get value of j
		// increment j
		// set value of j
	}

	public int getJ() {
		return j;
	}

	public String toString() {
		return "Value is " + i + "Value is " + j;
	}
}

// Multiple Synchronizing methods in one class may cause huge delay
// because if one synchronized method is using, then all the other methods need
// to wait until process completes
// So, Not Useful much