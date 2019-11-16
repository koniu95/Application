package com.example.HealthyApp.domain;

public class User {
    long ID;
    int height;
    float weight;
    int age;


    public User(long ID, int height, float weight, int age) {
        this.ID = ID;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
