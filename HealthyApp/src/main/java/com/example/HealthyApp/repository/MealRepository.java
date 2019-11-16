package com.example.HealthyApp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MealRepository {
    @PersistenceContext
    EntityManager em;
}
