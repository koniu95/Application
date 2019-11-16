package com.example.HealthyApp.controllers;

import com.example.HealthyApp.domain.Product;
import com.example.HealthyApp.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


//zadanie kontrolera - przyjąć, zwrócić wartość
@RestController
public class ProductController {
    ProductService ps;

    public ProductController(ProductService ps) {
        this.ps = ps;
    }

    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public Product addProduct(@RequestParam Map<String,String> map) {
        Product prod = new Product();
        prod.setWeight(Float.parseFloat(map.get("weight")));
        prod.setFat(Float.parseFloat(map.get("fat")));
        prod.setCarbohydrates(Float.parseFloat(map.get("carbohydrates")));
        prod.setSugar(Float.parseFloat(map.get("sugar")));
        prod.setProtein(Float.parseFloat(map.get("protein")));
        prod.setName(map.get("name"));

        Product result = ps.addProduct(prod);
        System.out.println(result);
        return result;
    }

    @RequestMapping(path = "/product/{name}", method = RequestMethod.GET)
    public List<Product> getProductByName(@PathVariable("name") String name) {

        return ps.getProduct(name);
    }

    @RequestMapping(path = "/product", method = RequestMethod.GET)
    public List<Product> getAllProducts() {

        return ps.getAllProducts();
    }
    @RequestMapping(path = "/product/{productId}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("productId") long productId) {

        ps.deleteProduct(productId);

    }
}
