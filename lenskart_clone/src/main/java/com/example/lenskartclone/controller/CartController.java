package com.example.lenskartclone.controller;

import com.example.lenskartclone.model.Cart;
import com.example.lenskartclone.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }
}
