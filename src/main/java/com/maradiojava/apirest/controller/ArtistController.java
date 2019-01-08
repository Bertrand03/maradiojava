package com.maradiojava.apirest.controller;

import com.maradiojava.apirest.model.Artist;
import com.maradiojava.apirest.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{artistId}")

    public Artist afficherArtiste(
            @PathVariable("artistId") Integer artistId) {
        return this.artistService.afficherArtiste(artistId);
    }

}
