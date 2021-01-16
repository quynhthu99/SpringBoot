package com.example.lesson4.controller;

import com.example.lesson4.dto.Product;
import com.example.lesson4.repository.ProductRepository;
import com.example.lesson4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/get-all-product")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/get-all-product/sort")
    public List<Product> getAllProduct(@RequestParam(required = false) String sortColumn, @RequestParam(required = false) Integer sortType) {
        return productService.getAllProduct(sortColumn, sortType);
    }

    @GetMapping("/find-by-id")
    public Product getById(@RequestParam String productId) {
        return productService.getById(productId);
    }

    @GetMapping("/find-by-name")
    public Product getByDisplay(@RequestParam String display) {
        return productService.getByDisplay(display);
    }

    @PutMapping("/update-by-id")
    public int updateById(@RequestBody Product product) {
        return productService.updateById(product);
    }

    @PostMapping("/create-product")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/delete-by-id")
    public int deleteById(@RequestParam String id) {
        return productService.deleteById(id);
    }

    //interceptor
    //filter
    //servlet
    //restController
    @RequestMapping("/test-ex")
    public Integer testException(@RequestParam Integer input) {
        return input;
    }
}
