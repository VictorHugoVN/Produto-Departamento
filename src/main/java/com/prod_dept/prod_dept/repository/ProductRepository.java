package com.prod_dept.prod_dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prod_dept.prod_dept.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
