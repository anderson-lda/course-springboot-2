package com.testtwo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testtwo.course.entities.Product;
import com.testtwo.course.repositories.ProductRepository;

@Service //registra a classe como um componente do spring(necessário pra ser injetado com o autowired)
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
