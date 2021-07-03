package com.testtwo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testtwo.course.entities.Product;
//@Repository nao eh necessario pois ja extende jpa... q tem repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
