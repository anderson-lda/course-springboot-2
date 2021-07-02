package com.testtwo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testtwo.course.entities.Category;
import com.testtwo.course.repositories.CategoryRepository;

@Service //registra a classe como um componente do spring(necessário pra ser injetado com o autowired)
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
