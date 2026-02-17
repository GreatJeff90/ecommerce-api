package com.cybertech.group15.ecommerce_api.service;

import com.cybertech.group15.ecommerce_api.model.Product;
import com.cybertech.group15.ecommerce_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Page<Product> getProducts(String category, Pageable pageable) {
        if (category != null && !category.isEmpty()) {
            return repository.findByCategoryIgnoreCase(category, pageable);
        }
        return repository.findAll(pageable);
    }
}