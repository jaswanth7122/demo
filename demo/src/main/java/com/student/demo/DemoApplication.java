package com.student.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.student.demo.model.Student;
import com.student.demo.service.StudentService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
		
		Student s  = context.getBean(Student.class);
		StudentService service = context.getBean(StudentService.class);
		s.setRollNo(21);
		s.setName("jas");
		s.setMarks(65);
		service.addStudent(s);
		List<Student> students = service.getStudents();
		System.out.println(students);
		
	}

}
