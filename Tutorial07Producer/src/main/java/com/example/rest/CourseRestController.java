package com.example.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.StudentModel;
import com.example.model.CourseModel;
import com.example.service.StudentService;
import com.example.service.CourseService;

@RestController

@RequestMapping("/rest")
public class CourseRestController
{
	@Autowired
	CourseService studentService;
	
	@RequestMapping("/course/view/{id_course}")
	public CourseModel view(@PathVariable(value = "id_course") String id_course)
    {
        CourseModel course = studentService.selectCourse(id_course);
		return course;
	}
	
	@RequestMapping("/course/viewall")
	public List<CourseModel> viewall(){
		List<CourseModel> courses = studentService.selectAllCourse ();
		return courses;
	}
	
	
}



