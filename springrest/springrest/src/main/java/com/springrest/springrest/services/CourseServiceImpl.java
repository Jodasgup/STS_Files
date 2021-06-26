package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;


@Service
public class CourseServiceImpl implements CourseService {
	
	List <Courses> list;

	public CourseServiceImpl() {
		
		
		list = new ArrayList<>();
		list.add(new Courses(145,"Java Core Course", "This Course contains basics of Java"));
	    list.add(new Courses(4343,"spring boot Course", "creating rest api using spring boot"));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
    public Courses getCourse(long courseID) {
        Courses c=null;
        for(Courses course:list)
        {
            if(course.getId()==courseID)
            {
                c=course;
                break;
            }
               
        }
        return c;
    }

	
	@Override
	public Courses addCourse(Courses courses) {
		// TODO Auto-generated method stub
		list.add(courses);
		return courses;
	}

	

}
