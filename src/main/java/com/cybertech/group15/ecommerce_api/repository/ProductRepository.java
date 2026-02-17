package com.cybertech.group15.ecommerce_api.repository;

import com.cybertech.group15.ecommerce_api.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // This allows filtering by category with built-in pagination
    Page<Product> findByCategoryIgnoreCase(String category, Pageable pageable);
}