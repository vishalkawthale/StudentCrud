package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Student;
import com.crud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public Student addStudent(Student student) {
		return this.repository.save(student);
	}

}
