package com.santhosh.Multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("Mohini"), new CallableTask("Bhavani"),
				new CallableTask("Sri Babu"));
		List<Future<String>> results = executorService.invokeAll(tasks);
		for (Future<String> result : results) {
			System.out.println(result.get());
		}
		executorService.shutdown();
	}

}
