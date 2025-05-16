package com.spring2.security2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring2.security2.model.Student;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class StudentController {
	List<Student> students = new ArrayList<>(List.of(
			new Student(1,"jaswanth","javascript"),
			new Student(2,"akhil","business")
			));
	
	@GetMapping("csrftoken")
	public CsrfToken getcsrftoken(HttpServletRequest req) {
		return (CsrfToken) req.getAttribute("_csrf");
	}
	@GetMapping("students")
	public List<Student> getallstudents(){
		return students;
	}
	@PostMapping("students")
	public void addStudent(@RequestBody Student student) {
		//TODO: process POST request
		
		students.add(student);
	}
	

}
