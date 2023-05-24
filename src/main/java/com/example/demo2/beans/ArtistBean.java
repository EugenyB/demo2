package com.example.demo2.beans;

import com.example.demo2.dao.ArtistDao;
import com.example.demo2.entities.Artist;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ArtistBean implements Serializable {

    @EJB
    private ArtistDao artistDao;

    public List<Artist> getArtists() {
        return artistDao.findAll();
    }
}
