package org.jsp.student_marks_spring_boot.service;

import java.util.List;

import org.jsp.student_marks_spring_boot.ResponseStructure;
import org.jsp.student_marks_spring_boot.dao.StudentDao;
import org.jsp.student_marks_spring_boot.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	public ResponseStructure<Student> saveStudent(Student student) {
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		student.setPercentage((student.getSub1()+student.getSub2()+student.getSub3()+student.getSub4()+student.getSub5()+student.getSub6())/6.0);
		structure.setData(dao.saveStudent(student));
		structure.setMessage("Saved");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return structure;
	}

	public ResponseStructure<Student> fetchStudent(int id) {
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		structure.setData(dao.fetchStudent(id).get());
		structure.setMessage("Found");
		structure.setStatusCode(HttpStatus.FOUND.value());
		return structure;
	}

	public ResponseStructure<List<Student>> fetchAllStudent() {
		ResponseStructure<List<Student>> structure = new ResponseStructure<List<Student>>();
		structure.setData(dao.fetchAllStudent());
		structure.setMessage("Found");
		structure.setStatusCode(HttpStatus.FOUND.value());
		return structure;
	}

}
