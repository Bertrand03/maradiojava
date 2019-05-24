package com.maradiojava.apirest.controller;

import com.maradiojava.apirest.exception.ConflictException;
import com.maradiojava.apirest.model.Album;
import com.maradiojava.apirest.model.Artist;
import com.maradiojava.apirest.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{ArtistId}")

    public Artist afficherArtiste(
            @PathVariable("ArtistId") Integer ArtistId) {
        return this.artistService.afficherArtiste(ArtistId);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            params = "name")

    public List<Artist> afficherArtiste2(
            @RequestParam("name") String name) {
        return this.artistService.afficherArtiste2 (name);
    }
    @RequestMapping
    public Page<Artist> findTousArtistes(
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size,
            @RequestParam("sortDirection") String sortDirection,
            @RequestParam("sortProperty") String sortProperty){
        return artistService.findTousArtistes(page, size, sortProperty, sortDirection);
    }
    @RequestMapping(
            method = RequestMethod.POST,
            value = "")

    public Artist ajouterArtist (
            @RequestBody Artist artist) throws ConflictException {
            return artistService.ajouterArtist(artist);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/{id}")

    public Artist modifierArtist(
            @PathVariable("id") Integer id,
            @RequestBody Artist artist) throws ConflictException{
        return artistService.modifierArtist(id, artist);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/{ArtistId}")
    @ResponseStatus (value = HttpStatus.NO_CONTENT)

    public @ResponseBody void supprimerArtist(
            @PathVariable("ArtistId") Integer ArtistId){

        artistService.supprimerArtist(ArtistId);
    }
}












