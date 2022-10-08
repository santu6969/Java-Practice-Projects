package com.santhosh.exceptionhandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		try {// Catch block
				// String str = null;
				// str.length();
			int i[] = { 1, 2 };
			int number = i[3];
			System.out.println("Method2 Ended");// After Any exception, The next lines of code will not be executed
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Matched Null Pointer Exception");
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Matched ArrayIndexOutOfBoundsException");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Matched Exception");

		}
	}

}
