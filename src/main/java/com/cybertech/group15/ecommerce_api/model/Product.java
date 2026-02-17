package com.cybertech.group15.ecommerce_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data // This handles getters/setters automatically
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String category;
    private String description;
    private Double price;
    private Integer stock;
}