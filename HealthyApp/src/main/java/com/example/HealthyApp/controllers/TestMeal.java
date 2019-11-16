package com.example.HealthyApp.controllers;

import com.example.HealthyApp.domain.Meal;
import com.example.HealthyApp.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMeal {
    @RequestMapping(path="/testMeal", name = "TESTMEAL")
    void test() {

    }

}
