package com.example.SpringDataJPA.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJPA.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	// following are custom methods
	   Student findByAccountNo (Long accountNo) ;
	   List<Student> findByNameContaining(String name);

}
