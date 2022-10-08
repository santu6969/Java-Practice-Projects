package com.santhosh.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger(); // Thread Safe
	// AtomicInteger is useful for small Operations only, for multiple operations it
	// is not Recommended
	private AtomicInteger j = new AtomicInteger();

	public void incrementI() {
		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public void incrementJ() {
		j.incrementAndGet();
	}

	public int getJ() {
		return j.get();
	}

	public String toString() {
		return "Value is " + i + "Value is " + j;
	}
}
