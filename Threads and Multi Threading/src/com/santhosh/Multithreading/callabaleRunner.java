package com.santhosh.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	private String name;

	CallableTask(String name) {
		this.name = name;

	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class callabaleRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("Santhosh"));
		System.out.println("\nNew Callable Task (\"Santhosh\") Executed");

		String welcomeMessege = welcomeFuture.get();
		System.out.println(welcomeMessege);
		System.out.println("Main Completed");
	}

}
