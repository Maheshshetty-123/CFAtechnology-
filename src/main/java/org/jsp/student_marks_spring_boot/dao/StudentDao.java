package org.jsp.student_marks_spring_boot.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.student_marks_spring_boot.dto.Student;
import org.jsp.student_marks_spring_boot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	@Autowired
	StudentRepository repository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public Optional<Student> fetchStudent(int id) {
		return repository.findById(id);
	}

	public List<Student> fetchAllStudent() {
		return repository.findAll();
	}

}
