package com.teco.loginsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teco.loginsystem.model.Student;
import com.teco.loginsystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "New student is added";
	}

	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		return studentService.getAllStudent();
	}

	@GetMapping("/remove")
	public String remove(@RequestBody Long id) {
		studentService.deleteStudent(id);
		return "Student deleted";
	}
}
