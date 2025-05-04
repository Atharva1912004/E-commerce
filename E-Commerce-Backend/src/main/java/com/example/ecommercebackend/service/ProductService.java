package com.example.ecommercebackend.service;

import com.example.ecommercebackend.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<Product> getAllProducts(String search);
    Product getProductById(UUID id);
}
