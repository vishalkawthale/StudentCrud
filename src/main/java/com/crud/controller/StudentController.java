package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Student;
import com.crud.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student addStudent = this.service.addStudent(student);
		return new ResponseEntity<Student>(addStudent, HttpStatus.CREATED);
	}

}
