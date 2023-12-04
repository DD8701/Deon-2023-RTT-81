package com.example.StudentLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.StudentLogin.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findByEmail(String email);

}
