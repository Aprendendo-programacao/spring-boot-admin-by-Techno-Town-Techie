package com.example.springbootadminclient.resource;

import com.example.springbootadminclient.model.Product;
import com.example.springbootadminclient.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductRepository productRepository;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Product findById(@PathVariable Integer id) {
        return productRepository.findById(id).get();
    }

}
