package com.example.lenskartclone.repository;

import com.example.lenskartclone.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
