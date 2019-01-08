package com.maradiojava.apirest.service;

import com.maradiojava.apirest.model.Artist;
import com.maradiojava.apirest.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
    public class ArtistService{
    @Autowired
    private ArtistRepository artistRepository;

    public Artist afficherArtiste(Integer artistId) {
        Artist a = artistRepository.findById(artistId);
        if(a == null){
        throw new EntityNotFoundException("L'artiste avec l'id numéro " + artistId + " n'existe pas" );
        }
        return a;
        }
    }

