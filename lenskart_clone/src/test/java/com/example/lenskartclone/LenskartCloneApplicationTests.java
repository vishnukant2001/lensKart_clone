package com.example.lenskartclone;

import com.example.lenskartclone.controller.CartController;
import com.example.lenskartclone.controller.ProductController;
import com.example.lenskartclone.controller.UserController;
import com.example.lenskartclone.service.CartService;
import com.example.lenskartclone.service.ProductService;
import com.example.lenskartclone.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LenskartCloneApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private UserController userController;

    @Autowired
    private ProductController productController;

    @Autowired
    private CartController cartController;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @Test
    void contextLoads() {
        assertThat(applicationContext).isNotNull();
    }

    @Test
    void userControllerLoads() {
        assertThat(userController).isNotNull();
    }

    @Test
    void productControllerLoads() {
        assertThat(productController).isNotNull();
    }

    @Test
    void cartControllerLoads() {
        assertThat(cartController).isNotNull();
    }

    @Test
    void userServiceLoads() {
        assertThat(userService).isNotNull();
    }

    @Test
    void productServiceLoads() {
        assertThat(productService).isNotNull();
    }

    @Test
    void cartServiceLoads() {
        assertThat(cartService).isNotNull();
    }
}
