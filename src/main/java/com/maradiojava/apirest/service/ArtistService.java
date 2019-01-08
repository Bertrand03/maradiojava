package com.maradiojava.apirest.service;

import com.maradiojava.apirest.Artist;
import com.maradiojava.apirest.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class ArtistService{
    @Autowired
    private ArtistRepository artistRepository;

    public Artist trouveId(Integer id) {
        Artist a = artistRepository.findById(id);
        return a;
        }
    }

