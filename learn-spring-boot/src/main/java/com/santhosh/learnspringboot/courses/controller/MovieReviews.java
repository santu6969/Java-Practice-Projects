package com.santhosh.learnspringboot.courses.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

interface MovieRepository extends JpaRepository<MovieReviews, Integer> {

}

@RestController
class MovieController {
	@Autowired
	private MovieRepository repository;

	@GetMapping("/MovieReviews")
	public List<MovieReviews> getAllReviews() {

		return repository.findAll();
	}
}

@Entity
public class MovieReviews {
	@Id
	@GeneratedValue
	private int reviewNumber;
	private byte movieRating;
	private String review;

	public MovieReviews() {
	}

	public MovieReviews(int reviewNumber, byte movieRating, String review) {
		super();
		this.reviewNumber = reviewNumber;
		this.movieRating = movieRating;
		this.review = review;
	}

	public int getReviewNumber() {
		return reviewNumber;
	}

	public void setReviewNumber(int reviewNumber) {
		this.reviewNumber = reviewNumber;
	}

	public byte getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(byte movieRating) {
		this.movieRating = movieRating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
