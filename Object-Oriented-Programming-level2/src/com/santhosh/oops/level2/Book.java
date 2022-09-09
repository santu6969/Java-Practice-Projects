package com.santhosh.oops.level2;

import java.util.ArrayList;

public class Book {
	// State
	private int id;
	private String bookName;
	private String author;
	ArrayList<Review> review = new ArrayList<Review>();

	// creating
	public Book(int id, String bookName, String author) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}

//Operations
	public void addReview(Review review) {
		this.review.add(review);
	}

//Print the State
	public String toString() {
		return String.format(
				"Book Id is: " + id + "\nBook Name is: " + bookName + "\nAuthor is: " + author + "\n" + review + "\n");
	}
}
