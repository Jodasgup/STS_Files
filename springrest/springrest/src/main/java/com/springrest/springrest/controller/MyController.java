package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home() {
		
		return "this is home page";
		}
	//get the courses
	
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		
		return this.courseservice.getCourses();
	}
	@GetMapping("/courses/{courseID}")
    public Courses getcourses(@PathVariable String courseID)
    {
        return this.courseservice.getCourse(Long.parseLong(courseID));
    }
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course)
	{
		return this.courseservice.addCourse(course);
	}
	
	

}
