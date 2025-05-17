package com.telusko.jdbc;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.jdbc.model.Student;



@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(JdbcApplication.class, args);
	StudentRepo repo = context.getBean(StudentRepo.class);
	Student s1 = context.getBean(Student.class);
	Student s2 = context.getBean(Student.class);
	Student s3 = context.getBean(Student.class);
	s1.setRollNo(1);
	s1.setName("jasa");
	s1.setMarks(65);
	s2.setRollNo(2);
	s2.setName("jassu");
	s2.setMarks(65);
	s3.setRollNo(3);
	s3.setName("jack");
	s3.setMarks(90);
//	repo.save(s1);
//	repo.save(s2);
//	repo.save(s3);
	System.out.println(repo.findByMarks(65));
	repo.delete(s3);
	
	}

}
