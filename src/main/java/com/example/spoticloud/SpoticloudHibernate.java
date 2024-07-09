package com.example.spoticloud;

import com.example.spoticloud.models.Genre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class SpoticloudHibernate {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("hibernate_spoticloud");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Genre> genres = null;
        TypedQuery<Genre> query = em.createQuery("SELECT g FROM Genre g", Genre.class);
        genres = query.getResultList();
        for (Genre genre : genres){
            System.out.println(genre);
        }

    }
}
