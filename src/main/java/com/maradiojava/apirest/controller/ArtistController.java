package com.maradiojava.apirest.controller;

import com.maradiojava.apirest.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
    @Autowired
    private ArtistService artistService;

}
