package com.example.HealthyApp.service;

import com.example.HealthyApp.domain.Product;
import com.example.HealthyApp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    ProductRepository pr;

    //dependecy injections
    public ProductService(ProductRepository pr) {
        this.pr = pr;
    }

    public Product addProduct(Product product) {
        return pr.addProduct(product);
    }

    public List<Product> getProduct(String name) {
        return pr.getAllProducts().stream()
                .filter(product -> name.equalsIgnoreCase(product.getName()))
                .collect(Collectors.toList());
    }

    public List<Product> getAllProducts() {

        return pr.getAllProducts();
    }
    public void deleteProduct(long productId) {
      pr.deleteProduct(productId);

    }
}
