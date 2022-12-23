package org.jsp.student_marks_spring_boot.controller;

import java.util.List;

import org.jsp.student_marks_spring_boot.ResponseStructure;
import org.jsp.student_marks_spring_boot.dto.Student;
import org.jsp.student_marks_spring_boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/students")
	public ResponseStructure<Student> saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("/students/{id}")
	public ResponseStructure<Student> fetchStudent(@PathVariable int id) {
		return service.fetchStudent(id);
	}
	
	@GetMapping("/students")
	public ResponseStructure<List<Student>> fetchAllStudent() {
		return service.fetchAllStudent();
	}

}
