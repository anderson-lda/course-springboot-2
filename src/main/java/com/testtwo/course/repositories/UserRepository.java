package com.testtwo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testtwo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
