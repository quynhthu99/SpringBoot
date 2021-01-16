package com.example.lesson4.service;

import com.example.lesson4.dto.Product;
import com.example.lesson4.helper.jdbcMapper.ProductMapper;
import com.example.lesson4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    //    public List<Product> getAllProductSort(String type) {
//        return productRepository.getAllProductSort(type);
//    }
    public List<Product> getAllProduct(String sortColumn, Integer sortType) {
        return productRepository.getAllProduct(sortColumn, sortType);
    }
//    public List<Product> getAllProductDesc() {
//        return productRepository.getAllProductDesc();
//    }

    public Product getById(String productId) {
        return productRepository.getById(productId);
    }

    public Product getByDisplay(String display) {
        return productRepository.getByDisplay(display);
    }

    ;

    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    public int updateById(Product product) {
        return productRepository.updateById(product);
    }

    public int deleteById(String id) {
        return productRepository.deleteById(id);
    }
}
