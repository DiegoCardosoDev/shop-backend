package com.diego.shop.springweb.services;


import com.diego.shop.springweb.entities.Product;
import com.diego.shop.springweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll(){
        List<Product> response = this.productRepository.findAll();
        return  response;
    }
}
