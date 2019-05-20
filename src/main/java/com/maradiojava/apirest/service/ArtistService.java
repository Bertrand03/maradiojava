package com.maradiojava.apirest.service;

import com.maradiojava.apirest.model.Artist;
import com.maradiojava.apirest.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Scanner;

@Service
    public class ArtistService{
    public static final Integer PAGE_SIZE_MIN = 10;
    public static final Integer PAGE_SIZE_MAX = 100;
    public static final Integer PAGE_MIN = 0;
    @Autowired
    private ArtistRepository artistRepository;

    public Artist afficherArtiste(Integer artistId) {
        Artist a = artistRepository.findById(artistId);
        if(a == null){
        throw new EntityNotFoundException("L'artiste avec l'id numéro " + artistId + " n'existe pas" );
        }
        return a;
        }

    public List<Artist> afficherArtiste2(String name) {
            List<Artist> a = artistRepository.findByName(name);{
                //if(a == null){
                //throw new EntityNotFoundException("L'artiste avec le nom " + name + " n'existe pas");
            }
            return a;
    }

    public Long comptageArtistes() {
        Long e = artistRepository.count();
        return e;
    }

    public Page<Artist> findTousArtistes(Integer page, Integer size, String sortProperty, String sortDirection) {

        if (page == null) {
            page = PAGE_MIN;
        } else if(page < 0) {
            throw new IllegalArgumentException("Le numéro de page ne peut être inférieur à 0");
        }

        if (size == null) {
            size = PAGE_SIZE_MIN;
        } else if(size < 0 || size > PAGE_SIZE_MAX) {
            throw new IllegalArgumentException("La taille de la page doit être comprise entre 1 et " + PAGE_SIZE_MAX);
        } else if (page > comptageArtistes()/size) {
            throw new IllegalArgumentException("Le numéro de page ne peut être supérieur à " + (comptageArtistes() / size) + 1);
        }

        Sort sort = null;
        try {
            sort = new Sort(new Sort.Order(Sort.Direction.fromString(sortDirection),sortProperty));
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Le sens du tri peut valoir 'ASC' pour un tri ascendant ou 'DESC' pour un tri descendant (insensible à la casse");
        }
        Pageable pageable = new PageRequest(page,size,sort);
        Page<Artist> artists = artistRepository.findAll(pageable);
        if(page >= artists.getTotalPages()){
            throw new IllegalArgumentException("Le numéro de page ne peut être supérieur à " + artists.getTotalPages());
        } else if(artists.getTotalElements() == 0){
            throw new EntityNotFoundException("Il n'y a aucun artist dans la base de données");
        }
        return artistRepository.findAll(pageable);
    }

    public Artist ajouterArtist(Artist artist) {

        return artistRepository.save(artist);
    }








}




