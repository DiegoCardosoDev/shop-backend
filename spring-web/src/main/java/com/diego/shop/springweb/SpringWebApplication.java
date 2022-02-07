package com.diego.shop.springweb;

import com.diego.shop.springweb.entities.Product;
import com.diego.shop.springweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringWebApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

    @Autowired
    private ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product(null,"notebook", 2000.0);
        Product p2 = new Product(null,"mesa gammer", 1500.0);
        Product p3 = new Product(null,"mouse", 150.9);
        Product p4 = new Product(null,"teclado rgb", 200.0);
        Product p5 = new Product(null,"monitor wide", 2500.0);
        Product p6 = new Product(null,"ssd 1T", 1000.0);
        Product p7 = new Product(null,"placa de video", 2899.0);
        Product p8 = new Product(null,"cpu gamer", 2700.9);

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));

    }
}
