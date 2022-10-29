package com.santhosh.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santhosh.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {// <Entity , Id Type>

}
