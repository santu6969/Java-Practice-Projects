package com.santhosh.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;
	Lock lockWithI = new ReentrantLock(); // Lock is a Thread Safe Operation
	Lock lockWithJ = new ReentrantLock();

	public void incrementI() {
		lockWithI.lock();
		// lock
		i = getI() + 1;
		// Unlock
		lockWithI.unlock();
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		lockWithJ.lock();
		// lock
		j = getJ() + 1;
		// unlock
		lockWithJ.unlock();
	}

	public int getJ() {
		return j;
	}

	public String toString() {
		return "Value is " + i + "Value is " + j;
	}
}
