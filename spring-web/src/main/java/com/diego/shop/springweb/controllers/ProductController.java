package com.diego.shop.springweb.controllers;

import com.diego.shop.springweb.entities.Product;
import com.diego.shop.springweb.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/products")
public class ProductController {


    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> listAll(){
        List<Product> list = productService.listAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id){
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }

}
