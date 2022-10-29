package com.santhosh.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.learnspringboot.courses.bean.Course;
import com.santhosh.learnspringboot.courses.repository.CourseRepository;

@RestController
public class CoursesController {

	@Autowired
	private CourseRepository repository;

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return repository.findAll();
	}

	@GetMapping("/courses/{id}") // http://localhost:8080/courses/1
	public Course getOneCourse(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("Id not Found");
		}
		return course.get();
	}

	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}

	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}
}
