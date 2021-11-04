package com.example.springbootadminclient.repository;

import com.example.springbootadminclient.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
