package com.example.StudentLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.StudentLogin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByName(String name);

}
