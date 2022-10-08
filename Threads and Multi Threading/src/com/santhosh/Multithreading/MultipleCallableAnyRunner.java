package com.santhosh.Multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableAnyRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("Mohini"), new CallableTask("Bhavani"),
				new CallableTask("Sri Babu"));
		String result = executorService.invokeAny(tasks);
		System.out.println(result);
		executorService.shutdown();
	}

}
