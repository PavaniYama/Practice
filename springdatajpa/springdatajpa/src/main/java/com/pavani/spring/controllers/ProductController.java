package com.pavani.spring.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavani.spring.data.entities.Product;
import com.pavani.spring.data.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public Iterable<Product> getProducts(){
		return repository.findAll();
		
	}
	@PostMapping
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}
	

}
