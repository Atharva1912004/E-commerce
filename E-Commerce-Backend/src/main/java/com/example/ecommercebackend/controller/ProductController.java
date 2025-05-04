package com.example.ecommercebackend.controller;

import com.example.ecommercebackend.entity.Product;
import com.example.ecommercebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getProducts(@RequestParam(required = false) String search) {
        return service.getAllProducts(search);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable UUID id) {
        return service.getProductById(id);
    }


}
