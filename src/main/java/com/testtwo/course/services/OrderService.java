package com.testtwo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testtwo.course.entities.Order;
import com.testtwo.course.repositories.OrderRepository;

@Service //registra a classe como um componente do spring(necessário pra ser injetado com o autowired)
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
