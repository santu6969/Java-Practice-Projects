package com.santhosh.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(125, "Object Oriented Programming with Java", "Santhosh");

		book.addReview(new Review(25, "Great Book", 5));
		System.out.println(book);
		book.addReview(new Review(29, "Awesome", 4.5));
		book.addReview(new Review(30, "Average", 3.5));
		book.addReview(new Review(45, "Great Book", 5));
		book.addReview(new Review(110, "Loved it", 5));
		System.out.println(book);

	}

}
