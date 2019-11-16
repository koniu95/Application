package com.example.HealthyApp;

import com.example.HealthyApp.domain.Product;
import com.example.HealthyApp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component
public class SampleDataLoader implements CommandLineRunner {


    ProductRepository productRepository;

    public SampleDataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //podstawowa baza produktów
    }
}
