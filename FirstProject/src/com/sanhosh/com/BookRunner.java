package com.sanhosh.com;

public class BookRunner {
	public static void main(String[] args) {
		
		Book artOfComputerLanguage = new Book(50);
		Book santu = new Book();

		//santu.setNoOfBooks(50);
		//santu.noOfBooks = 50;
		//artOfComputerLanguage.setNoOfBooks(100);
		//artOfComputerLanguage.noOfBooks = 100;
		//System.out.println(santu.noOfBooks);
		//System.out.println("Bike Started");
		System.out.println(santu.getNoOfBooks());
		System.out.println(artOfComputerLanguage.getNoOfBooks());
	}
}
