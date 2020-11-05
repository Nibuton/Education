package com.nibuton.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nibuton.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	List<Student> students = new ArrayList<>();
	
	@PostConstruct
	private void dataLoad() {
		students.add(new Student("Nikita", "Butov"));
		students.add(new Student("Katya", "Ivanova"));
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		if (studentId >= students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student with id: " + studentId + " not found");
		}
		return students.get(studentId);
	}

}
