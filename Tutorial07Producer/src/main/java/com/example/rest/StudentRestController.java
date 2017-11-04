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
public class StudentRestController
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/student/view/{npm}")
	public StudentModel view(@PathVariable(value = "npm") String npm){
		StudentModel student = studentService.selectStudent (npm);
		return student;
	}
	
}



