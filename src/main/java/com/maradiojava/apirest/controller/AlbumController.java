package com.maradiojava.apirest.controller;

import com.maradiojava.apirest.model.Album;
import com.maradiojava.apirest.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/albums")

public class AlbumController {

    @Autowired
    private AlbumService albumService;


    @RequestMapping(
            method = RequestMethod.POST,
            value = "")

    public Album ajouterAlbum(
         @RequestBody Album album) {
    return albumService.ajouterAlbum(album);
         }

    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/{id}")
    @ResponseStatus (value = HttpStatus.NO_CONTENT)

    public @ResponseBody void supprimerAlbum(
            @PathVariable ("id") Integer id){
    albumService.supprimerAlbum(id);
    }


}

