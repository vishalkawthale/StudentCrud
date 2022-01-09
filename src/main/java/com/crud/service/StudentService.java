package com.crud.service;

import org.springframework.stereotype.Service;

import com.crud.model.Student;

@Service
public interface StudentService {
	
	public Student addStudent(Student student);

}
