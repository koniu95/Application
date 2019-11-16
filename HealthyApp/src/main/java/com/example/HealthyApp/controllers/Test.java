package com.example.HealthyApp.controllers;

import com.example.HealthyApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


     //Java Scope
    ProductRepository pr;

    public Test(ProductRepository pr) {
        this.pr = pr;
    }



}


