package com.example.ecommercebackend.entity;

import com.example.ecommercebackend.enums.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    private BigDecimal price;
    private String brand;
    @Enumerated(EnumType.STRING)
    private Category category;

    private String imageUrl;
    private String description;




}
