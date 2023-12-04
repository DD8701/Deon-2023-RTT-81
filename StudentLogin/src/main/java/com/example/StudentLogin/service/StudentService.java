package com.example.StudentLogin.service;

import java.util.List;
import com.example.StudentLogin.dto.StudentDTO;
import com.example.StudentLogin.model.Student;

public interface StudentService {
	void saveStudent(StudentDTO studentDTO);

	Student findStudentByEmail(String email);

	List<StudentDTO> findAllStudents();
}
