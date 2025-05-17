package com.student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.model.Student;
import com.student.demo.repo.StudentRepo;
@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	public StudentRepo getRepo() {
		return repo;
	}
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		repo.save(s);
		
	}
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		return repo.findall();
	}
	

}
