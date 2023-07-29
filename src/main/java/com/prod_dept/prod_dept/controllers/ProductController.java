package com.prod_dept.prod_dept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod_dept.prod_dept.entities.Product;
import com.prod_dept.prod_dept.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getObjects() {
		List<Product> result = productRepository.findAll();
		return result;
	}
	
	
	//Buscando produto pelo id
	@GetMapping("/{id}")
	public Product findById(@PathVariable Long id) {
		Product result = productRepository.findById(id).get();
		return result;
	}
	
	
	//Inserindo novo produto
	@PostMapping
	public Product inserir(@RequestBody Product product) {
		Product result = productRepository.save(product);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
