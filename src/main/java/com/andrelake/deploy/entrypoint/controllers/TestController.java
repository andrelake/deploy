package com.andrelake.deploy.entrypoint.controllers;

import com.andrelake.deploy.domain.entities.Product;
import com.andrelake.deploy.entrypoint.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private final ProductRepository productRepository;

    public TestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public String getTest() {
        return "test";
    }

    @GetMapping("/create")
    public String createProduct() {
        var product = new Product("Product Test", "This is a test product", 10.00);
        return productRepository.save(product).toString();
    }

}
