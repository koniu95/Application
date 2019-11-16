//package com.example.HealthyApp.controllers;
//
//import com.example.HealthyApp.domain.Meal;
//import com.example.HealthyApp.domain.Product;
//import com.example.HealthyApp.service.MealService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class MealController {
//    MealService ms;
//    List<Product> product;
//
//
//    public MealController(MealService ms) {
//        this.ms = ms;
//    }
//
//    @RequestMapping
//    public Meal addMeal(@RequestParam Map<String, String> map) {
//
//        Meal meal = new Meal(product);
//
//        return meal;
//    }
//}
