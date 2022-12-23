package org.jsp.student_marks_spring_boot.repository;

import org.jsp.student_marks_spring_boot.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
