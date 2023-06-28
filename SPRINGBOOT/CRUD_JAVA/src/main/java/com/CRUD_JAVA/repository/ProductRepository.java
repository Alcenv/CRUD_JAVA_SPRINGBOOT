package com.CRUD_JAVA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD_JAVA.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
