package com.teco.loginsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teco.loginsystem.model.Student;

@Service
public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> getAllStudent();

	public Student deleteStudent(Long id);
}
