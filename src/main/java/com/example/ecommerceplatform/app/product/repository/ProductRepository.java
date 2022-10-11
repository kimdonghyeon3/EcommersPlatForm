package com.example.ecommerceplatform.app.product.repository;

import com.example.ecommerceplatform.app.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
