package com.example.HealthyApp.domain;

import javax.persistence.*;

@Entity // rzutowanie obiektu na baze danych
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // automatycznie generowane ID
    long productId;
    @Column(name = "nazwa_kolumny_weight")
    private float weight;
    @Column
    private float fat;
    @Column
    private float carbohydrates;
    @Column
    private float sugar;
    @Column
    private float protein;
    @Column
    private String name;


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", weight=" + weight +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                ", sugar=" + sugar +
                ", protein=" + protein +
                ", name='" + name + '\'' +
                '}';
    }
}
