package com.example.lenskartclone.repository;

import com.example.lenskartclone.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
