package com.example.lesson4.controller;

import com.example.lesson4.dto.Product;
import com.example.lesson4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/get-all-product")
    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @GetMapping("/get-by-id")
    public Product getById(@RequestParam String productId) {
        return productRepository.getById(productId);
    }

    @PostMapping("/create-product")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.addProduct(product);
    }
}
