package com.testtwo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testtwo.course.entities.Category;
//@Repository nao eh necessario pois ja extende jpa... q tem repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
