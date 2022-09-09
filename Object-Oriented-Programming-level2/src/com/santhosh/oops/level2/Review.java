package com.santhosh.oops.level2;

public class Review {
//State
	private int reviewNumber;
	private String comment;
	private double rating;

	// Creating
	Review(int reviewNumber, String comment, double rating) {
		this.reviewNumber = reviewNumber;
		this.comment = comment;
		this.rating = rating;
	}

	// Print the State
	public String toString() {
		return String.format("\nReview Number: " + this.reviewNumber + ", Comment is: " + this.comment + ", Rating is: "
				+ this.rating + "\n");
	}
}
