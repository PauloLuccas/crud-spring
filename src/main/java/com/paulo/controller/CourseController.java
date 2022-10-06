package com.paulo.controller;

import com.paulo.model.Course;
import com.paulo.repository.CourseRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    
    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
