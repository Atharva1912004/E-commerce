package com.example.ecommercebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.ecommercebackend.entity")
public class ECommerceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceBackendApplication.class, args);
    }

}
