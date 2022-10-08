package com.santhosh.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(2000);
			System.out.println("Hi all");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		someOtherMethod2();
	}

	private static void someOtherMethod2() throws RuntimeException {
	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

}
//Pre-defined Java classes
//class Error extends Throwable{} // due to out of memory or Stack over flow etc.. - We can't do anything about them
//class Exception extends Throwable{}
//class RuntimeException extends Exception{} - Unchecked Exception - no need to worry about it
// class NullpointerException extends RuntimeException{} 
//class InterruptedException extends Throwable{} - 
// // // Any Exception class that is not Runtime Exception and sub classes of it are checked exceptions - Risky- If method throws this exception, Calling method should handle it