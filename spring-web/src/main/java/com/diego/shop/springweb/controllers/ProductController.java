package com.diego.shop.springweb.controllers;

import com.diego.shop.springweb.entities.Product;
import com.diego.shop.springweb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> listAll(){
        List<Product> list = productService.listAll();
        return ResponseEntity.ok().body(list);
    }
}
