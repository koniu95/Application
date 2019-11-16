package com.example.HealthyApp.repository;

import com.example.HealthyApp.domain.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository //zamiennie @Service, @Component, @Controller
public class ProductRepository {
    @PersistenceContext //dostęp do DB
    private EntityManager em;



    @Transactional //musi być przy wszystkich metodach, oprócz pobierania danych z repository
    public Product addProduct(Product product) {
        em.persist(product);
        em.flush();
        return product;
    }

    public List<Product> getAllProducts() {

        return em.createQuery("from Product", Product.class).getResultList();
    }

    @Transactional
    public void deleteProduct(long productId) {

        Product product = em.find(Product.class, productId);

        if(product != null)
            em.remove(product);

    }
}
