package com.santhosh.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 1, 2, 3, 45 };
			int number = numbers[5];
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner close");
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("Just Before closing out main");
	}

}
//Code in the finally always execute unless the code in the Finally throws Exception, Then the next lines of code will not be executed
//without catch, finally can be execute, it would compile(i.e. try and finally together can execute, see below)
//try{
//code
//} finally{
//code
//} //<- this compiles

//only try can not compile