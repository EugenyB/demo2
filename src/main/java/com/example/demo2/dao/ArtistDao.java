package com.example.demo2.dao;

import com.example.demo2.entities.Artist;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class ArtistDao {

    @PersistenceContext
    private EntityManager em;

    public List<Artist> findAll() {
        return em.createNamedQuery("Artist.findAll", Artist.class).getResultList();
    }
}
