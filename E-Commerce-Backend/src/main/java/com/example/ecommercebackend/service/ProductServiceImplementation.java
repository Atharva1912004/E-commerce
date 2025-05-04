package com.example.ecommercebackend.service;

import com.example.ecommercebackend.entity.Product;
import com.example.ecommercebackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImplementation implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(String search){
        if(search != null && !search.isEmpty()) {
            return productRepository.findByNameContainingIgnoreCaseOrBrandContainingIgnoreCase(search,search);
        }
        return productRepository.findAll();
    }

    public Product getProductById(UUID id){
        return productRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Product not found"));
    }
}
